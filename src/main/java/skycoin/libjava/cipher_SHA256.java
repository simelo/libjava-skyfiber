/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skyfiber.libjava;

public class cipher_SHA256 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cipher_SHA256(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cipher_SHA256 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_cipher_SHA256(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(cipher_SHA256 a) {
    return skycoinJNI.cipher_SHA256_isEqual(swigCPtr, this, cipher_SHA256.getCPtr(a), a);
  }

  public void assignFrom(cipher_SHA256 data) {
    skycoinJNI.cipher_SHA256_assignFrom(swigCPtr, this, cipher_SHA256.getCPtr(data), data);
  }

  public void assignTo(cipher_SHA256 data) {
    skycoinJNI.cipher_SHA256_assignTo(swigCPtr, this, cipher_SHA256.getCPtr(data), data);
  }

  public _GoString_ getStr() {
    return new _GoString_(skycoinJNI.cipher_SHA256_getStr(swigCPtr, this), true);
  }

  public void setData(short[] value) {
    skycoinJNI.cipher_SHA256_data_set(swigCPtr, this, value);
  }

  public short[] getData() {
    return skycoinJNI.cipher_SHA256_data_get(swigCPtr, this);
  }

  public cipher_SHA256() {
    this(skycoinJNI.new_cipher_SHA256(), true);
  }

}
