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
 * Optional object for passing in billing period
 */
@ApiModel(description = "Optional object for passing in billing period")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class BillingPeriod {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;


  public BillingPeriod month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Numeric value representing billing period month.  1 &#x3D; January.
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric value representing billing period month.  1 = January.")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public BillingPeriod year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Numeric 4 digit representation of billing period year.
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric 4 digit representation of billing period year.")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPeriod billingPeriod = (BillingPeriod) o;
    return Objects.equals(this.month, billingPeriod.month) &&
        Objects.equals(this.year, billingPeriod.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPeriod {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

