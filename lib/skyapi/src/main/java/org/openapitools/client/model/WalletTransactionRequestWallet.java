/*
 * Skycoin REST API.
 * Skycoin is a next-generation cryptocurrency.
 *
 * OpenAPI spec version: 0.26.0
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
import java.util.ArrayList;
import java.util.List;

/**
 * WalletTransactionRequestWallet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-06T13:36:59.326162-04:00[America/Havana]")
public class WalletTransactionRequestWallet {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_UNSPENTS = "unspents";
  @SerializedName(SERIALIZED_NAME_UNSPENTS)
  private List<String> unspents = new ArrayList<String>();

  public WalletTransactionRequestWallet addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public WalletTransactionRequestWallet addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public WalletTransactionRequestWallet id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WalletTransactionRequestWallet password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WalletTransactionRequestWallet unspents(List<String> unspents) {
    this.unspents = unspents;
    return this;
  }

  public WalletTransactionRequestWallet addUnspentsItem(String unspentsItem) {
    if (this.unspents == null) {
      this.unspents = new ArrayList<String>();
    }
    this.unspents.add(unspentsItem);
    return this;
  }

   /**
   * Get unspents
   * @return unspents
  **/
  @ApiModelProperty(value = "")
  public List<String> getUnspents() {
    return unspents;
  }

  public void setUnspents(List<String> unspents) {
    this.unspents = unspents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionRequestWallet walletTransactionRequestWallet = (WalletTransactionRequestWallet) o;
    return Objects.equals(this.addresses, walletTransactionRequestWallet.addresses) &&
        Objects.equals(this.id, walletTransactionRequestWallet.id) &&
        Objects.equals(this.password, walletTransactionRequestWallet.password) &&
        Objects.equals(this.unspents, walletTransactionRequestWallet.unspents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, id, password, unspents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionRequestWallet {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    unspents: ").append(toIndentedString(unspents)).append("\n");
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

