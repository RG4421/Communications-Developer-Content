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
    /// Response body for tax calculation API.
    /// </summary>
    [DataContract]
    public partial class CalcTaxesResponse :  IEquatable<CalcTaxesResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CalcTaxesResponse" /> class.
        /// </summary>
        /// <param name="inv">Tax calculation results for each invoice submitted in request..</param>
        /// <param name="err">Error description (as applicable)..</param>
        public CalcTaxesResponse(List<InvoiceResult> inv = default(List<InvoiceResult>), List<Error> err = default(List<Error>))
        {
            this.Inv = inv;
            this.Err = err;
        }
        
        /// <summary>
        /// Tax calculation results for each invoice submitted in request.
        /// </summary>
        /// <value>Tax calculation results for each invoice submitted in request.</value>
        [DataMember(Name="inv", EmitDefaultValue=true)]
        public List<InvoiceResult> Inv { get; set; }

        /// <summary>
        /// Error description (as applicable).
        /// </summary>
        /// <value>Error description (as applicable).</value>
        [DataMember(Name="err", EmitDefaultValue=true)]
        public List<Error> Err { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CalcTaxesResponse {\n");
            sb.Append("  Inv: ").Append(Inv).Append("\n");
            sb.Append("  Err: ").Append(Err).Append("\n");
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
            return this.Equals(input as CalcTaxesResponse);
        }

        /// <summary>
        /// Returns true if CalcTaxesResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of CalcTaxesResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CalcTaxesResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Inv == input.Inv ||
                    this.Inv != null &&
                    input.Inv != null &&
                    this.Inv.SequenceEqual(input.Inv)
                ) && 
                (
                    this.Err == input.Err ||
                    this.Err != null &&
                    input.Err != null &&
                    this.Err.SequenceEqual(input.Err)
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
                if (this.Inv != null)
                    hashCode = hashCode * 59 + this.Inv.GetHashCode();
                if (this.Err != null)
                    hashCode = hashCode * 59 + this.Err.GetHashCode();
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
