/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
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
 * TSPairData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class TSPairData {
  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "TransactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private Integer transactionType;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "ServiceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private Integer serviceType;

  public static final String SERIALIZED_NAME_MARKET_TYPE = "MarketType";
  @SerializedName(SERIALIZED_NAME_MARKET_TYPE)
  private Integer marketType;

  public static final String SERIALIZED_NAME_INTERFACE_TYPE = "InterfaceType";
  @SerializedName(SERIALIZED_NAME_INTERFACE_TYPE)
  private Integer interfaceType;

  public static final String SERIALIZED_NAME_INPUT_TYPE = "InputType";
  @SerializedName(SERIALIZED_NAME_INPUT_TYPE)
  private Integer inputType;

  public static final String SERIALIZED_NAME_IS_BUNDLE = "IsBundle";
  @SerializedName(SERIALIZED_NAME_IS_BUNDLE)
  private Boolean isBundle;

  public static final String SERIALIZED_NAME_TRANSACTION_DESCRIPTION = "TransactionDescription";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DESCRIPTION)
  private String transactionDescription;

  public static final String SERIALIZED_NAME_SERVICE_DESCRIPTION = "ServiceDescription";
  @SerializedName(SERIALIZED_NAME_SERVICE_DESCRIPTION)
  private String serviceDescription;

  public static final String SERIALIZED_NAME_TS_PAIR_DESCRIPTION = "TSPairDescription";
  @SerializedName(SERIALIZED_NAME_TS_PAIR_DESCRIPTION)
  private String tsPairDescription;


  public TSPairData transactionType(Integer transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(Integer transactionType) {
    this.transactionType = transactionType;
  }


  public TSPairData serviceType(Integer serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getServiceType() {
    return serviceType;
  }


  public void setServiceType(Integer serviceType) {
    this.serviceType = serviceType;
  }


  public TSPairData marketType(Integer marketType) {
    
    this.marketType = marketType;
    return this;
  }

   /**
   * Get marketType
   * @return marketType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMarketType() {
    return marketType;
  }


  public void setMarketType(Integer marketType) {
    this.marketType = marketType;
  }


  public TSPairData interfaceType(Integer interfaceType) {
    
    this.interfaceType = interfaceType;
    return this;
  }

   /**
   * Get interfaceType
   * @return interfaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInterfaceType() {
    return interfaceType;
  }


  public void setInterfaceType(Integer interfaceType) {
    this.interfaceType = interfaceType;
  }


  public TSPairData inputType(Integer inputType) {
    
    this.inputType = inputType;
    return this;
  }

   /**
   * Get inputType
   * @return inputType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInputType() {
    return inputType;
  }


  public void setInputType(Integer inputType) {
    this.inputType = inputType;
  }


  public TSPairData isBundle(Boolean isBundle) {
    
    this.isBundle = isBundle;
    return this;
  }

   /**
   * Get isBundle
   * @return isBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBundle() {
    return isBundle;
  }


  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }


  public TSPairData transactionDescription(String transactionDescription) {
    
    this.transactionDescription = transactionDescription;
    return this;
  }

   /**
   * Get transactionDescription
   * @return transactionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionDescription() {
    return transactionDescription;
  }


  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }


  public TSPairData serviceDescription(String serviceDescription) {
    
    this.serviceDescription = serviceDescription;
    return this;
  }

   /**
   * Get serviceDescription
   * @return serviceDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceDescription() {
    return serviceDescription;
  }


  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }


  public TSPairData tsPairDescription(String tsPairDescription) {
    
    this.tsPairDescription = tsPairDescription;
    return this;
  }

   /**
   * Get tsPairDescription
   * @return tsPairDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTsPairDescription() {
    return tsPairDescription;
  }


  public void setTsPairDescription(String tsPairDescription) {
    this.tsPairDescription = tsPairDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSPairData tsPairData = (TSPairData) o;
    return Objects.equals(this.transactionType, tsPairData.transactionType) &&
        Objects.equals(this.serviceType, tsPairData.serviceType) &&
        Objects.equals(this.marketType, tsPairData.marketType) &&
        Objects.equals(this.interfaceType, tsPairData.interfaceType) &&
        Objects.equals(this.inputType, tsPairData.inputType) &&
        Objects.equals(this.isBundle, tsPairData.isBundle) &&
        Objects.equals(this.transactionDescription, tsPairData.transactionDescription) &&
        Objects.equals(this.serviceDescription, tsPairData.serviceDescription) &&
        Objects.equals(this.tsPairDescription, tsPairData.tsPairDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionType, serviceType, marketType, interfaceType, inputType, isBundle, transactionDescription, serviceDescription, tsPairDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSPairData {\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    tsPairDescription: ").append(toIndentedString(tsPairDescription)).append("\n");
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

