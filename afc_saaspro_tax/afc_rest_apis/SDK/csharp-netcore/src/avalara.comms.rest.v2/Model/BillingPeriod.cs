/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = avalara.comms.rest.v2.Client.OpenAPIDateConverter;

namespace avalara.comms.rest.v2.Model
{
    /// <summary>
    /// Optional object for passing in billing period
    /// </summary>
    [DataContract]
    public partial class BillingPeriod :  IEquatable<BillingPeriod>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BillingPeriod" /> class.
        /// </summary>
        /// <param name="month">Numeric value representing billing period month.  1 &#x3D; January..</param>
        /// <param name="year">Numeric 4 digit representation of billing period year..</param>
        public BillingPeriod(int month = default(int), int year = default(int))
        {
            this.Month = month;
            this.Year = year;
        }
        
        /// <summary>
        /// Numeric value representing billing period month.  1 &#x3D; January.
        /// </summary>
        /// <value>Numeric value representing billing period month.  1 &#x3D; January.</value>
        [DataMember(Name="month", EmitDefaultValue=false)]
        public int Month { get; set; }

        /// <summary>
        /// Numeric 4 digit representation of billing period year.
        /// </summary>
        /// <value>Numeric 4 digit representation of billing period year.</value>
        [DataMember(Name="year", EmitDefaultValue=false)]
        public int Year { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BillingPeriod {\n");
            sb.Append("  Month: ").Append(Month).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BillingPeriod);
        }

        /// <summary>
        /// Returns true if BillingPeriod instances are equal
        /// </summary>
        /// <param name="input">Instance of BillingPeriod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BillingPeriod input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Month == input.Month ||
                    this.Month.Equals(input.Month)
                ) && 
                (
                    this.Year == input.Year ||
                    this.Year.Equals(input.Year)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.Month.GetHashCode();
                hashCode = hashCode * 59 + this.Year.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
