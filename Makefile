.DEFAULT_GOAL := help
.PHONY: configure build-libc build-swig build-libc-swig build
.PHONY: test  help

# Compilation output
.ONESHELL:
SHELL := /bin/bash

MKFILE_PATH   = $(abspath $(lastword $(MAKEFILE_LIST)))
REPO_ROOT     = $(dir $(MKFILE_PATH))
GOPATH_DIR    = gopath
SKYLIBC_DIR  ?= $(GOPATH_DIR)/src/github.com/skycoin/libskycoin
SKYCOIN_DIR  ?= $(SKYLIBC_DIR)/vendor/github.com/skycoin/skycoin
SKYBUILD_DIR  = $(SKYLIBC_DIR)/build
BUILDLIBC_DIR = $(SKYBUILD_DIR)/libskycoin
LIBC_DIR      = $(SKYLIBC_DIR)/lib/cgo
LIBSWIG_DIR   = swig
BUILD_DIR     = build
DIST_DIR      = dist
BIN_DIR       = $(SKYLIBC_DIR)/bin
INCLUDE_DIR   = $(SKYLIBC_DIR)/include
FULL_PATH_LIB = $(REPO_ROOT)/$(BUILDLIBC_DIR)

LIB_FILES = $(shell find $(SKYLIBC_DIR)/lib/cgo -type f -name "*.go")
SRC_FILES = $(shell find $(SKYCOIN_DIR)/src -type f -name "*.go")
SWIG_FILES = $(shell find $(LIBSWIG_DIR) -type f -name "*.i")
HEADER_FILES = $(shell find $(INCLUDE_DIR) -type f -name "*.h")
LIB_JAVA_WRAPPER= $(REPO_ROOT)/lib/skyapi
# Platform specific checks
OSNAME = $(TRAVIS_OS_NAME)
OS =
JAVA_HOME =
LDFLAGS =
OTHERLIB =
FOLDERLIB = $(PWD)/build/usr/lib
ifeq ($(shell uname -s),Linux)
  JAVA_HOME = $(shell readlink -f /usr/bin/javac | sed "s:/bin/javac::")
  OS = linux
  LDPATH=$(shell printenv LD_LIBRARY_PATH)
  LDPATHVAR=LD_LIBRARY_PATH
  LDFLAGS= -shared
  LDNAME= libskycoin.so
ifndef OSNAME
  OSNAME = linux
endif
else ifeq ($(shell uname -s),Darwin)
ifndef OSNAME
  OSNAME = Darwin
endif
  JAVA_HOME = $(shell /usr/libexec/java_home)
  OS = darwin
  LDFLAGS = -dynamiclib -flat_namespace -static -framework CoreFoundation -framework Security -framework JavaVM
  LDPATH=$(shell printenv DYLD_LIBRARY_PATH)
  LDPATHVAR=DYLD_LIBRARY_PATH
  LDNAME= libskycoin.jnilib
  OTHERLIB=-I/System/Library/Frameworks/JavaVM.framework/Headers
  FOLDERLIB=~/Library/Java/Extensions
else

endif

configure-linux:
	@echo ""

configure-darwin:
	mkdir -p ~/Library/ ~/Library/Java ~/Library/Java/Extensions

configure: configure-$(OS)
	mkdir -p $(BUILD_DIR)/usr/tmp $(BUILD_DIR)/usr/lib $(BUILD_DIR)/usr/include
	mkdir -p $(BUILDLIBC_DIR) $(BIN_DIR) $(INCLUDE_DIR)

build-libc: configure ## Build libskycoin C client library
	rm -f $(BUILDLIBC_DIR)/libskycoin.a
	GOPATH="$(REPO_ROOT)/$(GOPATH_DIR)" make -C $(SKYLIBC_DIR) clean-libc
	GOPATH="$(REPO_ROOT)/$(GOPATH_DIR)" make -C $(SKYLIBC_DIR) build-libc-static
	rm -f swig/include/libskycoin.h
	mkdir -p swig/include
	grep -v _Complex $(INCLUDE_DIR)/libskycoin.h > swig/include/libskycoin.h

build-swig: ## Generate libjava
	#Generate structs.i from skytypes.gen.h
	rm -f $(LIBSWIG_DIR)/structs.i
	cp $(INCLUDE_DIR)/skytypes.gen.h $(LIBSWIG_DIR)/structs.i
	#sed -i 's/#/%/g' $(LIBSWIG_DIR)/structs.i
	{ \
		if [[ "$$(uname -s)" == "Darwin" ]]; then \
			sed -i '.kbk' 's/#/%/g' $(LIBSWIG_DIR)/structs.i ;\
		else \
			sed -i 's/#/%/g' $(LIBSWIG_DIR)/structs.i ;\
		fi \
	}
	rm -f swig/include/swig.h
	rm -f skycoinnet_wrap.c
	mkdir -p src/main/java/skycoin/libjava
	swig  -DUSE_ASSERT_EXCEPTIONS -java -v -package skycoin.libjava -Iswig/include -I$(INCLUDE_DIR) -outdir src/main/java/skycoin/libjava -o skycoin_wrap.c $(LIBSWIG_DIR)/skycoin.i

build-libc-swig: build-libc build-swig

build-libjava:
	rm -rf $(PWD)/build/usr/lib/$(LDNAME)
	gcc -c -fPIC $(OTHERLIB) -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/$(OS) -Iswig/include -I$(INCLUDE_DIR) skycoin_wrap.c
	gcc -v $(LDFLAGS) -fPIC -o $(FOLDERLIB)/$(LDNAME) skycoin_wrap.o $(BUILDLIBC_DIR)/libskycoin.a

test: clean build-libc build-swig build-libjava ## Running test
	$(LDPATHVAR)="$(FOLDERLIB):$(LDPATHVAR)" mvn test
	(cd $(LIB_JAVA_WRAPPER) && mvn test)
	(cd lib/skyapi-feign && mvn test)
	(cd lib/skyapi-resttemplate && mvn test)
	(cd lib/skyapi-vertx && mvn test)
	(cd lib/skyapi-restassured && mvn test)
	(cd lib/skyapi-jersey2 && mvn test)
	(cd lib/skyapi-retrofit2 && mvn test)
	(cd lib/skyapi-resteasy && mvn test)

clean: ## Clean all trash
	GOPATH="$(REPO_ROOT)/$(GOPATH_DIR)" make -C $(SKYLIBC_DIR) clean-libc
	mvn pre-clean
	mvn clean
	mvn post-clean
	(cd $(LIB_JAVA_WRAPPER) && mvn clean)
	(cd lib/skyapi-feign && mvn clean)
	(cd lib/skyapi-resttemplate && mvn clean)
	(cd lib/skyapi-vertx && mvn clean)
	(cd lib/skyapi-restassured && mvn clean)
	(cd lib/skyapi-jersey2 && mvn clean)
	(cd lib/skyapi-retrofit2 && mvn clean)
	(cd lib/skyapi-resteasy && mvn clean)

package: ## Package libskycoin and libskyapi
	$(LDPATHVAR)="$(FOLDERLIB):$(LDPATHVAR)"  mvn package
	(cd $(LIB_JAVA_WRAPPER) && mvn package)
	(cd lib/skyapi-feign && mvn package)
	(cd lib/skyapi-resttemplate && mvn package)
	(cd lib/skyapi-vertx && mvn package)
	(cd lib/skyapi-restassured && mvn package)
	(cd lib/skyapi-jersey2 && mvn package)
	(cd lib/skyapi-retrofit2 && mvn package)
	(cd lib/skyapi-resteasy && mvn package)

deploy-travis: ## Deploy to  libskycoin and libskyapi
	$(LDPATHVAR)="$(FOLDERLIB):$(LDPATHVAR)"  mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true
	(cd $(LIB_JAVA_WRAPPER) && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-feign && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-resttemplate && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-vertx && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-restassured && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-jersey2 && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-retrofit2 && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 
	(cd lib/skyapi-resteasy && mvn deploy --settings $(REPO_ROOT)/.travis/settings.xml -DskipTests=true -Dskip=true) 

help: ## List available commands
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
