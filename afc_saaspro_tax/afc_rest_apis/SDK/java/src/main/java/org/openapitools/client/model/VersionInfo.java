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
 * Version specific results for service info request.
 */
@ApiModel(description = "Version specific results for service info request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class VersionInfo {
  public static final String SERIALIZED_NAME_AFC_ENGINE_VERSION = "AfcEngineVersion";
  @SerializedName(SERIALIZED_NAME_AFC_ENGINE_VERSION)
  private String afcEngineVersion;

  public static final String SERIALIZED_NAME_BUILD_VERSION = "BuildVersion";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION)
  private String buildVersion;


  public VersionInfo afcEngineVersion(String afcEngineVersion) {
    
    this.afcEngineVersion = afcEngineVersion;
    return this;
  }

   /**
   * AFC Engine Version
   * @return afcEngineVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AFC Engine Version")

  public String getAfcEngineVersion() {
    return afcEngineVersion;
  }


  public void setAfcEngineVersion(String afcEngineVersion) {
    this.afcEngineVersion = afcEngineVersion;
  }


  public VersionInfo buildVersion(String buildVersion) {
    
    this.buildVersion = buildVersion;
    return this;
  }

   /**
   * Service Build Version.
   * @return buildVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service Build Version.")

  public String getBuildVersion() {
    return buildVersion;
  }


  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.afcEngineVersion, versionInfo.afcEngineVersion) &&
        Objects.equals(this.buildVersion, versionInfo.buildVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afcEngineVersion, buildVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    sb.append("    afcEngineVersion: ").append(toIndentedString(afcEngineVersion)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
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

