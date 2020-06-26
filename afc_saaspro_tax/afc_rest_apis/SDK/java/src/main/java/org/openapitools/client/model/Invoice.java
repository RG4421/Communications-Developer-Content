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
import org.openapitools.client.model.BillingPeriod;
import org.openapitools.client.model.KeyValuePair;
import org.openapitools.client.model.LineItem;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.TaxExemption;
import org.threeten.bp.OffsetDateTime;

/**
 * Contains information about an invoice or quote.
 */
@ApiModel(description = "Contains information about an invoice or quote.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-10T00:57:00.867-04:00[America/New_York]")
public class Invoice {
  public static final String SERIALIZED_NAME_DOC = "doc";
  @SerializedName(SERIALIZED_NAME_DOC)
  private String doc;

  public static final String SERIALIZED_NAME_CMMT = "cmmt";
  @SerializedName(SERIALIZED_NAME_CMMT)
  private Boolean cmmt;

  public static final String SERIALIZED_NAME_BILL = "bill";
  @SerializedName(SERIALIZED_NAME_BILL)
  private Location bill;

  public static final String SERIALIZED_NAME_CUST = "cust";
  @SerializedName(SERIALIZED_NAME_CUST)
  private Integer cust;

  public static final String SERIALIZED_NAME_LFLN = "lfln";
  @SerializedName(SERIALIZED_NAME_LFLN)
  private Boolean lfln;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_EXMS = "exms";
  @SerializedName(SERIALIZED_NAME_EXMS)
  private List<TaxExemption> exms = null;

  public static final String SERIALIZED_NAME_ITMS = "itms";
  @SerializedName(SERIALIZED_NAME_ITMS)
  private List<LineItem> itms = null;

  public static final String SERIALIZED_NAME_INVM = "invm";
  @SerializedName(SERIALIZED_NAME_INVM)
  private Boolean invm;

  public static final String SERIALIZED_NAME_DTL = "dtl";
  @SerializedName(SERIALIZED_NAME_DTL)
  private Boolean dtl;

  public static final String SERIALIZED_NAME_SUMM = "summ";
  @SerializedName(SERIALIZED_NAME_SUMM)
  private Boolean summ;

  public static final String SERIALIZED_NAME_OPT = "opt";
  @SerializedName(SERIALIZED_NAME_OPT)
  private List<KeyValuePair> opt = null;

  public static final String SERIALIZED_NAME_ACCT = "acct";
  @SerializedName(SERIALIZED_NAME_ACCT)
  private String acct;

  public static final String SERIALIZED_NAME_CUSTREF = "custref";
  @SerializedName(SERIALIZED_NAME_CUSTREF)
  private String custref;

  public static final String SERIALIZED_NAME_INVN = "invn";
  @SerializedName(SERIALIZED_NAME_INVN)
  private String invn;

  public static final String SERIALIZED_NAME_BCYC = "bcyc";
  @SerializedName(SERIALIZED_NAME_BCYC)
  private String bcyc;

  public static final String SERIALIZED_NAME_BPD = "bpd";
  @SerializedName(SERIALIZED_NAME_BPD)
  private BillingPeriod bpd;

  public static final String SERIALIZED_NAME_CCYCD = "ccycd";
  @SerializedName(SERIALIZED_NAME_CCYCD)
  private String ccycd;


  public Invoice doc(String doc) {
    
    this.doc = doc;
    return this;
  }

   /**
   * Document code.
   * @return doc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document code.")

  public String getDoc() {
    return doc;
  }


  public void setDoc(String doc) {
    this.doc = doc;
  }


  public Invoice cmmt(Boolean cmmt) {
    
    this.cmmt = cmmt;
    return this;
  }

   /**
   * Indicates if invoice should be committed as soon as it is processed.  Default: false.
   * @return cmmt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if invoice should be committed as soon as it is processed.  Default: false.")

  public Boolean getCmmt() {
    return cmmt;
  }


  public void setCmmt(Boolean cmmt) {
    this.cmmt = cmmt;
  }


  public Invoice bill(Location bill) {
    
    this.bill = bill;
    return this;
  }

   /**
   * Get bill
   * @return bill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getBill() {
    return bill;
  }


  public void setBill(Location bill) {
    this.bill = bill;
  }


  public Invoice cust(Integer cust) {
    
    this.cust = cust;
    return this;
  }

   /**
   * Customer type.
   * @return cust
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer type.")

  public Integer getCust() {
    return cust;
  }


  public void setCust(Integer cust) {
    this.cust = cust;
  }


  public Invoice lfln(Boolean lfln) {
    
    this.lfln = lfln;
    return this;
  }

   /**
   * Indicates if customer is a Lifeline participant.  Default: false.
   * @return lfln
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if customer is a Lifeline participant.  Default: false.")

  public Boolean getLfln() {
    return lfln;
  }


  public void setLfln(Boolean lfln) {
    this.lfln = lfln;
  }


  public Invoice date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Invoice date.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invoice date.")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Invoice exms(List<TaxExemption> exms) {
    
    this.exms = exms;
    return this;
  }

  public Invoice addExmsItem(TaxExemption exmsItem) {
    if (this.exms == null) {
      this.exms = new ArrayList<TaxExemption>();
    }
    this.exms.add(exmsItem);
    return this;
  }

   /**
   * Tax exemptions.
   * @return exms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax exemptions.")

  public List<TaxExemption> getExms() {
    return exms;
  }


  public void setExms(List<TaxExemption> exms) {
    this.exms = exms;
  }


  public Invoice itms(List<LineItem> itms) {
    
    this.itms = itms;
    return this;
  }

  public Invoice addItmsItem(LineItem itmsItem) {
    if (this.itms == null) {
      this.itms = new ArrayList<LineItem>();
    }
    this.itms.add(itmsItem);
    return this;
  }

   /**
   * Line items.
   * @return itms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Line items.")

  public List<LineItem> getItms() {
    return itms;
  }


  public void setItms(List<LineItem> itms) {
    this.itms = itms;
  }


  public Invoice invm(Boolean invm) {
    
    this.invm = invm;
    return this;
  }

   /**
   * Indicates if all line items within invoice should be processed in invoice mode.  Default: true.
   * @return invm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if all line items within invoice should be processed in invoice mode.  Default: true.")

  public Boolean getInvm() {
    return invm;
  }


  public void setInvm(Boolean invm) {
    this.invm = invm;
  }


  public Invoice dtl(Boolean dtl) {
    
    this.dtl = dtl;
    return this;
  }

   /**
   * Indicates if individual line item taxes should be included in response.  Default: true.
   * @return dtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if individual line item taxes should be included in response.  Default: true.")

  public Boolean getDtl() {
    return dtl;
  }


  public void setDtl(Boolean dtl) {
    this.dtl = dtl;
  }


  public Invoice summ(Boolean summ) {
    
    this.summ = summ;
    return this;
  }

   /**
   * Indicates if the summarized taxes for the invoice should be included in the resonse.  Default: false.
   * @return summ
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the summarized taxes for the invoice should be included in the resonse.  Default: false.")

  public Boolean getSumm() {
    return summ;
  }


  public void setSumm(Boolean summ) {
    this.summ = summ;
  }


  public Invoice opt(List<KeyValuePair> opt) {
    
    this.opt = opt;
    return this;
  }

  public Invoice addOptItem(KeyValuePair optItem) {
    if (this.opt == null) {
      this.opt = new ArrayList<KeyValuePair>();
    }
    this.opt.add(optItem);
    return this;
  }

   /**
   * Optional values for invoice. Maximum of 5. Keys must be numeric from 1 to 5.
   * @return opt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional values for invoice. Maximum of 5. Keys must be numeric from 1 to 5.")

  public List<KeyValuePair> getOpt() {
    return opt;
  }


  public void setOpt(List<KeyValuePair> opt) {
    this.opt = opt;
  }


  public Invoice acct(String acct) {
    
    this.acct = acct;
    return this;
  }

   /**
   * Account reference for reporting
   * @return acct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account reference for reporting")

  public String getAcct() {
    return acct;
  }


  public void setAcct(String acct) {
    this.acct = acct;
  }


  public Invoice custref(String custref) {
    
    this.custref = custref;
    return this;
  }

   /**
   * Customer Reference for reporting
   * @return custref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer Reference for reporting")

  public String getCustref() {
    return custref;
  }


  public void setCustref(String custref) {
    this.custref = custref;
  }


  public Invoice invn(String invn) {
    
    this.invn = invn;
    return this;
  }

   /**
   * Invoice Number reference for reporting
   * @return invn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Invoice Number reference for reporting")

  public String getInvn() {
    return invn;
  }


  public void setInvn(String invn) {
    this.invn = invn;
  }


  public Invoice bcyc(String bcyc) {
    
    this.bcyc = bcyc;
    return this;
  }

   /**
   * Bill Cycle reference for reporting
   * @return bcyc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bill Cycle reference for reporting")

  public String getBcyc() {
    return bcyc;
  }


  public void setBcyc(String bcyc) {
    this.bcyc = bcyc;
  }


  public Invoice bpd(BillingPeriod bpd) {
    
    this.bpd = bpd;
    return this;
  }

   /**
   * Get bpd
   * @return bpd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingPeriod getBpd() {
    return bpd;
  }


  public void setBpd(BillingPeriod bpd) {
    this.bpd = bpd;
  }


  public Invoice ccycd(String ccycd) {
    
    this.ccycd = ccycd;
    return this;
  }

   /**
   * Currency code for invoice.  Example: CAD &#x3D; Canadian Dollar
   * @return ccycd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency code for invoice.  Example: CAD = Canadian Dollar")

  public String getCcycd() {
    return ccycd;
  }


  public void setCcycd(String ccycd) {
    this.ccycd = ccycd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.doc, invoice.doc) &&
        Objects.equals(this.cmmt, invoice.cmmt) &&
        Objects.equals(this.bill, invoice.bill) &&
        Objects.equals(this.cust, invoice.cust) &&
        Objects.equals(this.lfln, invoice.lfln) &&
        Objects.equals(this.date, invoice.date) &&
        Objects.equals(this.exms, invoice.exms) &&
        Objects.equals(this.itms, invoice.itms) &&
        Objects.equals(this.invm, invoice.invm) &&
        Objects.equals(this.dtl, invoice.dtl) &&
        Objects.equals(this.summ, invoice.summ) &&
        Objects.equals(this.opt, invoice.opt) &&
        Objects.equals(this.acct, invoice.acct) &&
        Objects.equals(this.custref, invoice.custref) &&
        Objects.equals(this.invn, invoice.invn) &&
        Objects.equals(this.bcyc, invoice.bcyc) &&
        Objects.equals(this.bpd, invoice.bpd) &&
        Objects.equals(this.ccycd, invoice.ccycd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doc, cmmt, bill, cust, lfln, date, exms, itms, invm, dtl, summ, opt, acct, custref, invn, bcyc, bpd, ccycd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    cmmt: ").append(toIndentedString(cmmt)).append("\n");
    sb.append("    bill: ").append(toIndentedString(bill)).append("\n");
    sb.append("    cust: ").append(toIndentedString(cust)).append("\n");
    sb.append("    lfln: ").append(toIndentedString(lfln)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    exms: ").append(toIndentedString(exms)).append("\n");
    sb.append("    itms: ").append(toIndentedString(itms)).append("\n");
    sb.append("    invm: ").append(toIndentedString(invm)).append("\n");
    sb.append("    dtl: ").append(toIndentedString(dtl)).append("\n");
    sb.append("    summ: ").append(toIndentedString(summ)).append("\n");
    sb.append("    opt: ").append(toIndentedString(opt)).append("\n");
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
    sb.append("    custref: ").append(toIndentedString(custref)).append("\n");
    sb.append("    invn: ").append(toIndentedString(invn)).append("\n");
    sb.append("    bcyc: ").append(toIndentedString(bcyc)).append("\n");
    sb.append("    bpd: ").append(toIndentedString(bpd)).append("\n");
    sb.append("    ccycd: ").append(toIndentedString(ccycd)).append("\n");
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
