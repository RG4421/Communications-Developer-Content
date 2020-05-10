/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using avalara.comms.rest.v2.Api;
using avalara.comms.rest.v2.Model;
using avalara.comms.rest.v2.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace avalara.comms.rest.v2.Test
{
    /// <summary>
    ///  Class for testing InlineObject
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class InlineObjectTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for InlineObject
        //private InlineObject instance;

        public InlineObjectTests()
        {
            // TODO uncomment below to create an instance of InlineObject
            //instance = new InlineObject();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of InlineObject
        /// </summary>
        [Fact]
        public void InlineObjectInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" InlineObject
            //Assert.IsInstanceOfType<InlineObject> (instance, "variable 'instance' is a InlineObject");
        }


        /// <summary>
        /// Test the property 'GeoBatchFile'
        /// </summary>
        [Fact]
        public void GeoBatchFileTest()
        {
            // TODO unit test for the property 'GeoBatchFile'
        }

    }

}
