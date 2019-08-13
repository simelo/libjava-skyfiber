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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TransactionStatus;
import org.openapitools.client.model.TransactionVerboseTxnInputs;

/**
 * TransactionVerbose has readable transaction data. It adds TransactionStatus to a BlockTransactionVerbose
 */
@ApiModel(description = "TransactionVerbose has readable transaction data. It adds TransactionStatus to a BlockTransactionVerbose")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:13:07.983-04:00[America/Havana]")
public class TransactionVerboseTxn {
  @JsonProperty("status")
  private TransactionStatus status = null;

  @JsonProperty("fee")
  private Long fee;

  @JsonProperty("inner_hash")
  private String innerHash;

  @JsonProperty("inputs")
  private List<TransactionVerboseTxnInputs> inputs = new ArrayList<TransactionVerboseTxnInputs>();

  @JsonProperty("length")
  private Integer length;

  @JsonProperty("outputs")
  private List<Object> outputs = new ArrayList<Object>();

  @JsonProperty("sigs")
  private List<String> sigs = new ArrayList<String>();

  @JsonProperty("timestamp")
  private Long timestamp;

  @JsonProperty("txid")
  private String txid;

  @JsonProperty("type")
  private Integer type;

  public TransactionVerboseTxn status(TransactionStatus status) {
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

  public TransactionVerboseTxn fee(Long fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  public Long getFee() {
    return fee;
  }

  public void setFee(Long fee) {
    this.fee = fee;
  }

  public TransactionVerboseTxn innerHash(String innerHash) {
    this.innerHash = innerHash;
    return this;
  }

   /**
   * Get innerHash
   * @return innerHash
  **/
  @ApiModelProperty(value = "")
  public String getInnerHash() {
    return innerHash;
  }

  public void setInnerHash(String innerHash) {
    this.innerHash = innerHash;
  }

  public TransactionVerboseTxn inputs(List<TransactionVerboseTxnInputs> inputs) {
    this.inputs = inputs;
    return this;
  }

  public TransactionVerboseTxn addInputsItem(TransactionVerboseTxnInputs inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<TransactionVerboseTxnInputs>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<TransactionVerboseTxnInputs> getInputs() {
    return inputs;
  }

  public void setInputs(List<TransactionVerboseTxnInputs> inputs) {
    this.inputs = inputs;
  }

  public TransactionVerboseTxn length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public TransactionVerboseTxn outputs(List<Object> outputs) {
    this.outputs = outputs;
    return this;
  }

  public TransactionVerboseTxn addOutputsItem(Object outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<Object>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<Object> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<Object> outputs) {
    this.outputs = outputs;
  }

  public TransactionVerboseTxn sigs(List<String> sigs) {
    this.sigs = sigs;
    return this;
  }

  public TransactionVerboseTxn addSigsItem(String sigsItem) {
    if (this.sigs == null) {
      this.sigs = new ArrayList<String>();
    }
    this.sigs.add(sigsItem);
    return this;
  }

   /**
   * Get sigs
   * @return sigs
  **/
  @ApiModelProperty(value = "")
  public List<String> getSigs() {
    return sigs;
  }

  public void setSigs(List<String> sigs) {
    this.sigs = sigs;
  }

  public TransactionVerboseTxn timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public TransactionVerboseTxn txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * Get txid
   * @return txid
  **/
  @ApiModelProperty(value = "")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public TransactionVerboseTxn type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVerboseTxn transactionVerboseTxn = (TransactionVerboseTxn) o;
    return Objects.equals(this.status, transactionVerboseTxn.status) &&
        Objects.equals(this.fee, transactionVerboseTxn.fee) &&
        Objects.equals(this.innerHash, transactionVerboseTxn.innerHash) &&
        Objects.equals(this.inputs, transactionVerboseTxn.inputs) &&
        Objects.equals(this.length, transactionVerboseTxn.length) &&
        Objects.equals(this.outputs, transactionVerboseTxn.outputs) &&
        Objects.equals(this.sigs, transactionVerboseTxn.sigs) &&
        Objects.equals(this.timestamp, transactionVerboseTxn.timestamp) &&
        Objects.equals(this.txid, transactionVerboseTxn.txid) &&
        Objects.equals(this.type, transactionVerboseTxn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fee, innerHash, inputs, length, outputs, sigs, timestamp, txid, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVerboseTxn {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    innerHash: ").append(toIndentedString(innerHash)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    sigs: ").append(toIndentedString(sigs)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

