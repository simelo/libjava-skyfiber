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

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-05T22:49:48.091-04:00[America/Havana]")
public class InlineResponse2002 {
  @JsonProperty("current_coinhour_supply")
  private String currentCoinhourSupply;

  @JsonProperty("current_supply")
  private String currentSupply;

  @JsonProperty("locked_distribution_addresses")
  private List<String> lockedDistributionAddresses = new ArrayList<String>();

  @JsonProperty("max_supply")
  private String maxSupply;

  @JsonProperty("total_coinhour_supply")
  private String totalCoinhourSupply;

  @JsonProperty("total_supply")
  private String totalSupply;

  @JsonProperty("unlocked_distribution_addresses")
  private List<String> unlockedDistributionAddresses = new ArrayList<String>();

  public InlineResponse2002 currentCoinhourSupply(String currentCoinhourSupply) {
    this.currentCoinhourSupply = currentCoinhourSupply;
    return this;
  }

   /**
   * CurrentCoinHourSupply is coins hours in non distribution addresses.
   * @return currentCoinhourSupply
  **/
  @ApiModelProperty(value = "CurrentCoinHourSupply is coins hours in non distribution addresses.")
  public String getCurrentCoinhourSupply() {
    return currentCoinhourSupply;
  }

  public void setCurrentCoinhourSupply(String currentCoinhourSupply) {
    this.currentCoinhourSupply = currentCoinhourSupply;
  }

  public InlineResponse2002 currentSupply(String currentSupply) {
    this.currentSupply = currentSupply;
    return this;
  }

   /**
   * Coins distributed beyond the project.
   * @return currentSupply
  **/
  @ApiModelProperty(value = "Coins distributed beyond the project.")
  public String getCurrentSupply() {
    return currentSupply;
  }

  public void setCurrentSupply(String currentSupply) {
    this.currentSupply = currentSupply;
  }

  public InlineResponse2002 lockedDistributionAddresses(List<String> lockedDistributionAddresses) {
    this.lockedDistributionAddresses = lockedDistributionAddresses;
    return this;
  }

  public InlineResponse2002 addLockedDistributionAddressesItem(String lockedDistributionAddressesItem) {
    if (this.lockedDistributionAddresses == null) {
      this.lockedDistributionAddresses = new ArrayList<String>();
    }
    this.lockedDistributionAddresses.add(lockedDistributionAddressesItem);
    return this;
  }

   /**
   * Distribution addresses which are locked and do not count towards total supply.
   * @return lockedDistributionAddresses
  **/
  @ApiModelProperty(value = "Distribution addresses which are locked and do not count towards total supply.")
  public List<String> getLockedDistributionAddresses() {
    return lockedDistributionAddresses;
  }

  public void setLockedDistributionAddresses(List<String> lockedDistributionAddresses) {
    this.lockedDistributionAddresses = lockedDistributionAddresses;
  }

  public InlineResponse2002 maxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * MaxSupply is the maximum number of coins to be distributed ever.
   * @return maxSupply
  **/
  @ApiModelProperty(value = "MaxSupply is the maximum number of coins to be distributed ever.")
  public String getMaxSupply() {
    return maxSupply;
  }

  public void setMaxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
  }

  public InlineResponse2002 totalCoinhourSupply(String totalCoinhourSupply) {
    this.totalCoinhourSupply = totalCoinhourSupply;
    return this;
  }

   /**
   * TotalCoinHourSupply is coin hours in all addresses including unlocked distribution addresses.
   * @return totalCoinhourSupply
  **/
  @ApiModelProperty(value = "TotalCoinHourSupply is coin hours in all addresses including unlocked distribution addresses.")
  public String getTotalCoinhourSupply() {
    return totalCoinhourSupply;
  }

  public void setTotalCoinhourSupply(String totalCoinhourSupply) {
    this.totalCoinhourSupply = totalCoinhourSupply;
  }

  public InlineResponse2002 totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * TotalSupply is CurrentSupply plus coins held by the distribution addresses that are spendable.
   * @return totalSupply
  **/
  @ApiModelProperty(value = "TotalSupply is CurrentSupply plus coins held by the distribution addresses that are spendable.")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  public InlineResponse2002 unlockedDistributionAddresses(List<String> unlockedDistributionAddresses) {
    this.unlockedDistributionAddresses = unlockedDistributionAddresses;
    return this;
  }

  public InlineResponse2002 addUnlockedDistributionAddressesItem(String unlockedDistributionAddressesItem) {
    if (this.unlockedDistributionAddresses == null) {
      this.unlockedDistributionAddresses = new ArrayList<String>();
    }
    this.unlockedDistributionAddresses.add(unlockedDistributionAddressesItem);
    return this;
  }

   /**
   * Distribution addresses which count towards total supply.
   * @return unlockedDistributionAddresses
  **/
  @ApiModelProperty(value = "Distribution addresses which count towards total supply.")
  public List<String> getUnlockedDistributionAddresses() {
    return unlockedDistributionAddresses;
  }

  public void setUnlockedDistributionAddresses(List<String> unlockedDistributionAddresses) {
    this.unlockedDistributionAddresses = unlockedDistributionAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.currentCoinhourSupply, inlineResponse2002.currentCoinhourSupply) &&
        Objects.equals(this.currentSupply, inlineResponse2002.currentSupply) &&
        Objects.equals(this.lockedDistributionAddresses, inlineResponse2002.lockedDistributionAddresses) &&
        Objects.equals(this.maxSupply, inlineResponse2002.maxSupply) &&
        Objects.equals(this.totalCoinhourSupply, inlineResponse2002.totalCoinhourSupply) &&
        Objects.equals(this.totalSupply, inlineResponse2002.totalSupply) &&
        Objects.equals(this.unlockedDistributionAddresses, inlineResponse2002.unlockedDistributionAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentCoinhourSupply, currentSupply, lockedDistributionAddresses, maxSupply, totalCoinhourSupply, totalSupply, unlockedDistributionAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    sb.append("    currentCoinhourSupply: ").append(toIndentedString(currentCoinhourSupply)).append("\n");
    sb.append("    currentSupply: ").append(toIndentedString(currentSupply)).append("\n");
    sb.append("    lockedDistributionAddresses: ").append(toIndentedString(lockedDistributionAddresses)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
    sb.append("    totalCoinhourSupply: ").append(toIndentedString(totalCoinhourSupply)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    unlockedDistributionAddresses: ").append(toIndentedString(unlockedDistributionAddresses)).append("\n");
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

