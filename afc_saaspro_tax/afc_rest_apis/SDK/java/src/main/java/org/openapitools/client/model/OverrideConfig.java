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
import java.util.ArrayList;
import java.util.List;

/**
 * Settings associated with a client profile override  Maybe associated with 0 to many profiles
 */
@ApiModel(description = "Settings associated with a client profile override  Maybe associated with 0 to many profiles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class OverrideConfig {
  public static final String SERIALIZED_NAME_RAW_DATA = "RawData";
  @SerializedName(SERIALIZED_NAME_RAW_DATA)
  private List<String> rawData = null;


  public OverrideConfig rawData(List<String> rawData) {
    
    this.rawData = rawData;
    return this;
  }

  public OverrideConfig addRawDataItem(String rawDataItem) {
    if (this.rawData == null) {
      this.rawData = new ArrayList<String>();
    }
    this.rawData.add(rawDataItem);
    return this;
  }

   /**
   * Raw data
   * @return rawData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw data")

  public List<String> getRawData() {
    return rawData;
  }


  public void setRawData(List<String> rawData) {
    this.rawData = rawData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverrideConfig overrideConfig = (OverrideConfig) o;
    return Objects.equals(this.rawData, overrideConfig.rawData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideConfig {\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
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

