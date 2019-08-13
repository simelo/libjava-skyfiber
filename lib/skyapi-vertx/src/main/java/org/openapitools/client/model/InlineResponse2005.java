/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * The version of the OpenAPI document: 0.27.0
 * Contact: contact@skycoin.net
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2005
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:35:41.357-04:00[America/Havana]")
public class InlineResponse2005 {
  @JsonProperty("branch")
  private String branch;

  @JsonProperty("commit")
  private String commit;

  @JsonProperty("version")
  private String version;

  public InlineResponse2005 branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * git branch name
   * @return branch
  **/
  @ApiModelProperty(value = "git branch name")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public InlineResponse2005 commit(String commit) {
    this.commit = commit;
    return this;
  }

   /**
   * git commit id
   * @return commit
  **/
  @ApiModelProperty(value = "git commit id")
  public String getCommit() {
    return commit;
  }

  public void setCommit(String commit) {
    this.commit = commit;
  }

  public InlineResponse2005 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * version number
   * @return version
  **/
  @ApiModelProperty(value = "version number")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.branch, inlineResponse2005.branch) &&
        Objects.equals(this.commit, inlineResponse2005.commit) &&
        Objects.equals(this.version, inlineResponse2005.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commit, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

