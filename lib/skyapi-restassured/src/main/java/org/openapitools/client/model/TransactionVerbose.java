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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.TransactionStatus;
import org.openapitools.client.model.TransactionVerboseTxn;

/**
 * TransactionVerbose
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:47:16.376-04:00[America/Havana]")
public class TransactionVerbose {
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransactionStatus status = null;

  public static final String SERIALIZED_NAME_TXN = "txn";
  @SerializedName(SERIALIZED_NAME_TXN)
  private TransactionVerboseTxn txn = null;

  public TransactionVerbose time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public TransactionVerbose status(TransactionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public TransactionStatus getStatus() {
    return status;
  }

  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public TransactionVerbose txn(TransactionVerboseTxn txn) {
    this.txn = txn;
    return this;
  }

   /**
   * Get txn
   * @return txn
  **/
  @ApiModelProperty(value = "")
  public TransactionVerboseTxn getTxn() {
    return txn;
  }

  public void setTxn(TransactionVerboseTxn txn) {
    this.txn = txn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVerbose transactionVerbose = (TransactionVerbose) o;
    return Objects.equals(this.time, transactionVerbose.time) &&
        Objects.equals(this.status, transactionVerbose.status) &&
        Objects.equals(this.txn, transactionVerbose.txn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, status, txn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVerbose {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
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

