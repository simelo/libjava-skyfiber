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
import org.openapitools.client.model.WalletTransactionRequestHoursSelection;
import org.openapitools.client.model.WalletTransactionRequestWallet;

/**
 * WalletTransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-06T00:35:41.357-04:00[America/Havana]")
public class WalletTransactionRequest {
  @JsonProperty("change_address")
  private String changeAddress;

  @JsonProperty("hours_selection")
  private WalletTransactionRequestHoursSelection hoursSelection = null;

  @JsonProperty("ignore_unconfirmed")
  private Boolean ignoreUnconfirmed;

  @JsonProperty("to")
  private List<Object> to = new ArrayList<>();

  @JsonProperty("wallet")
  private WalletTransactionRequestWallet wallet = null;

  public WalletTransactionRequest changeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
    return this;
  }

   /**
   * Get changeAddress
   * @return changeAddress
  **/
  @ApiModelProperty(value = "")
  public String getChangeAddress() {
    return changeAddress;
  }

  public void setChangeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
  }

  public WalletTransactionRequest hoursSelection(WalletTransactionRequestHoursSelection hoursSelection) {
    this.hoursSelection = hoursSelection;
    return this;
  }

   /**
   * Get hoursSelection
   * @return hoursSelection
  **/
  @ApiModelProperty(value = "")
  public WalletTransactionRequestHoursSelection getHoursSelection() {
    return hoursSelection;
  }

  public void setHoursSelection(WalletTransactionRequestHoursSelection hoursSelection) {
    this.hoursSelection = hoursSelection;
  }

  public WalletTransactionRequest ignoreUnconfirmed(Boolean ignoreUnconfirmed) {
    this.ignoreUnconfirmed = ignoreUnconfirmed;
    return this;
  }

   /**
   * Get ignoreUnconfirmed
   * @return ignoreUnconfirmed
  **/
  @ApiModelProperty(value = "")
  public Boolean getIgnoreUnconfirmed() {
    return ignoreUnconfirmed;
  }

  public void setIgnoreUnconfirmed(Boolean ignoreUnconfirmed) {
    this.ignoreUnconfirmed = ignoreUnconfirmed;
  }

  public WalletTransactionRequest to(List<Object> to) {
    this.to = to;
    return this;
  }

  public WalletTransactionRequest addToItem(Object toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(value = "")
  public List<Object> getTo() {
    return to;
  }

  public void setTo(List<Object> to) {
    this.to = to;
  }

  public WalletTransactionRequest wallet(WalletTransactionRequestWallet wallet) {
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @ApiModelProperty(value = "")
  public WalletTransactionRequestWallet getWallet() {
    return wallet;
  }

  public void setWallet(WalletTransactionRequestWallet wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionRequest walletTransactionRequest = (WalletTransactionRequest) o;
    return Objects.equals(this.changeAddress, walletTransactionRequest.changeAddress) &&
        Objects.equals(this.hoursSelection, walletTransactionRequest.hoursSelection) &&
        Objects.equals(this.ignoreUnconfirmed, walletTransactionRequest.ignoreUnconfirmed) &&
        Objects.equals(this.to, walletTransactionRequest.to) &&
        Objects.equals(this.wallet, walletTransactionRequest.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeAddress, hoursSelection, ignoreUnconfirmed, to, wallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionRequest {\n");
    sb.append("    changeAddress: ").append(toIndentedString(changeAddress)).append("\n");
    sb.append("    hoursSelection: ").append(toIndentedString(hoursSelection)).append("\n");
    sb.append("    ignoreUnconfirmed: ").append(toIndentedString(ignoreUnconfirmed)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

