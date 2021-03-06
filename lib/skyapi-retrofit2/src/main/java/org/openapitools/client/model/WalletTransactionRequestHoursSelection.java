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
 * WalletTransactionRequestHoursSelection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T23:05:01.558-04:00[America/Havana]")
public class WalletTransactionRequestHoursSelection {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_SHARE_FACTOR = "share_factor";
  @SerializedName(SERIALIZED_NAME_SHARE_FACTOR)
  private String shareFactor;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public WalletTransactionRequestHoursSelection mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public WalletTransactionRequestHoursSelection shareFactor(String shareFactor) {
    this.shareFactor = shareFactor;
    return this;
  }

   /**
   * Get shareFactor
   * @return shareFactor
  **/
  @ApiModelProperty(value = "")
  public String getShareFactor() {
    return shareFactor;
  }

  public void setShareFactor(String shareFactor) {
    this.shareFactor = shareFactor;
  }

  public WalletTransactionRequestHoursSelection type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    WalletTransactionRequestHoursSelection walletTransactionRequestHoursSelection = (WalletTransactionRequestHoursSelection) o;
    return Objects.equals(this.mode, walletTransactionRequestHoursSelection.mode) &&
        Objects.equals(this.shareFactor, walletTransactionRequestHoursSelection.shareFactor) &&
        Objects.equals(this.type, walletTransactionRequestHoursSelection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, shareFactor, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionRequestHoursSelection {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    shareFactor: ").append(toIndentedString(shareFactor)).append("\n");
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

