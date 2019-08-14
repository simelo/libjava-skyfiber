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

/**
 * TransactionStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T23:05:01.558-04:00[America/Havana]")
public class TransactionStatus {
  public static final String SERIALIZED_NAME_BLOCK_SEQ = "block_seq";
  @SerializedName(SERIALIZED_NAME_BLOCK_SEQ)
  private Long blockSeq;

  public static final String SERIALIZED_NAME_CONFIRMED = "confirmed";
  @SerializedName(SERIALIZED_NAME_CONFIRMED)
  private Boolean confirmed;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_UNCONFIRMED = "unconfirmed";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED)
  private Boolean unconfirmed;

  public TransactionStatus blockSeq(Long blockSeq) {
    this.blockSeq = blockSeq;
    return this;
  }

   /**
   * If confirmed, the sequence of the block in which the transaction was executed
   * @return blockSeq
  **/
  @ApiModelProperty(value = "If confirmed, the sequence of the block in which the transaction was executed")
  public Long getBlockSeq() {
    return blockSeq;
  }

  public void setBlockSeq(Long blockSeq) {
    this.blockSeq = blockSeq;
  }

  public TransactionStatus confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public Boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public TransactionStatus height(Long height) {
    this.height = height;
    return this;
  }

   /**
   * If confirmed, how many blocks deep in the chain it is. Will be at least 1 if confirmed
   * @return height
  **/
  @ApiModelProperty(value = "If confirmed, how many blocks deep in the chain it is. Will be at least 1 if confirmed")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public TransactionStatus unconfirmed(Boolean unconfirmed) {
    this.unconfirmed = unconfirmed;
    return this;
  }

   /**
   * Get unconfirmed
   * @return unconfirmed
  **/
  @ApiModelProperty(value = "")
  public Boolean getUnconfirmed() {
    return unconfirmed;
  }

  public void setUnconfirmed(Boolean unconfirmed) {
    this.unconfirmed = unconfirmed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatus transactionStatus = (TransactionStatus) o;
    return Objects.equals(this.blockSeq, transactionStatus.blockSeq) &&
        Objects.equals(this.confirmed, transactionStatus.confirmed) &&
        Objects.equals(this.height, transactionStatus.height) &&
        Objects.equals(this.unconfirmed, transactionStatus.unconfirmed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockSeq, confirmed, height, unconfirmed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatus {\n");
    sb.append("    blockSeq: ").append(toIndentedString(blockSeq)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    unconfirmed: ").append(toIndentedString(unconfirmed)).append("\n");
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

