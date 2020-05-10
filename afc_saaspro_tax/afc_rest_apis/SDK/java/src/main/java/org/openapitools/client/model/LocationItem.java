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
 * LocationItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class LocationItem {
  public static final String SERIALIZED_NAME_IS_ALTERNATE = "IsAlternate";
  @SerializedName(SERIALIZED_NAME_IS_ALTERNATE)
  private Boolean isAlternate;

  public static final String SERIALIZED_NAME_COUNTRY_ISO = "CountryIso";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO)
  private String countryIso;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTY = "County";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county;

  public static final String SERIALIZED_NAME_LOCALITY = "Locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_PCODE = "PCode";
  @SerializedName(SERIALIZED_NAME_PCODE)
  private Integer pcode;


  public LocationItem isAlternate(Boolean isAlternate) {
    
    this.isAlternate = isAlternate;
    return this;
  }

   /**
   * Get isAlternate
   * @return isAlternate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAlternate() {
    return isAlternate;
  }


  public void setIsAlternate(Boolean isAlternate) {
    this.isAlternate = isAlternate;
  }


  public LocationItem countryIso(String countryIso) {
    
    this.countryIso = countryIso;
    return this;
  }

   /**
   * Get countryIso
   * @return countryIso
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryIso() {
    return countryIso;
  }


  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }


  public LocationItem state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public LocationItem county(String county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCounty() {
    return county;
  }


  public void setCounty(String county) {
    this.county = county;
  }


  public LocationItem locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public LocationItem pcode(Integer pcode) {
    
    this.pcode = pcode;
    return this;
  }

   /**
   * Get pcode
   * @return pcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPcode() {
    return pcode;
  }


  public void setPcode(Integer pcode) {
    this.pcode = pcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationItem locationItem = (LocationItem) o;
    return Objects.equals(this.isAlternate, locationItem.isAlternate) &&
        Objects.equals(this.countryIso, locationItem.countryIso) &&
        Objects.equals(this.state, locationItem.state) &&
        Objects.equals(this.county, locationItem.county) &&
        Objects.equals(this.locality, locationItem.locality) &&
        Objects.equals(this.pcode, locationItem.pcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAlternate, countryIso, state, county, locality, pcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationItem {\n");
    sb.append("    isAlternate: ").append(toIndentedString(isAlternate)).append("\n");
    sb.append("    countryIso: ").append(toIndentedString(countryIso)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    pcode: ").append(toIndentedString(pcode)).append("\n");
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

