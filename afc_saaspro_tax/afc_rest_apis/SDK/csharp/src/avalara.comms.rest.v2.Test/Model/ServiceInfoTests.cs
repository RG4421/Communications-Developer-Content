/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using NUnit.Framework;

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
    ///  Class for testing ServiceInfo
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ServiceInfoTests
    {
        // TODO uncomment below to declare an instance variable for ServiceInfo
        //private ServiceInfo instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of ServiceInfo
            //instance = new ServiceInfo();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ServiceInfo
        /// </summary>
        [Test]
        public void ServiceInfoInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOf" ServiceInfo
            //Assert.IsInstanceOf(typeof(ServiceInfo), instance);
        }


        /// <summary>
        /// Test the property 'ServerTime'
        /// </summary>
        [Test]
        public void ServerTimeTest()
        {
            // TODO unit test for the property 'ServerTime'
        }
        /// <summary>
        /// Test the property 'Versions'
        /// </summary>
        [Test]
        public void VersionsTest()
        {
            // TODO unit test for the property 'Versions'
        }
        /// <summary>
        /// Test the property 'Error'
        /// </summary>
        [Test]
        public void ErrorTest()
        {
            // TODO unit test for the property 'Error'
        }

    }

}
