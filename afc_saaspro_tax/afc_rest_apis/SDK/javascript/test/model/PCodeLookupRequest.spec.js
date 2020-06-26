/**
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SaasPro);
  }
}(this, function(expect, SaasPro) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SaasPro.PCodeLookupRequest();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('PCodeLookupRequest', function() {
    it('should create an instance of PCodeLookupRequest', function() {
      // uncomment below and update the code to test PCodeLookupRequest
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be.a(SaasPro.PCodeLookupRequest);
    });

    it('should have the property countryIso (base name: "CountryIso")', function() {
      // uncomment below and update the code to test the property countryIso
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "State")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property county (base name: "County")', function() {
      // uncomment below and update the code to test the property county
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property city (base name: "City")', function() {
      // uncomment below and update the code to test the property city
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property zipCode (base name: "ZipCode")', function() {
      // uncomment below and update the code to test the property zipCode
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property bestMatch (base name: "BestMatch")', function() {
      // uncomment below and update the code to test the property bestMatch
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property limitResults (base name: "LimitResults")', function() {
      // uncomment below and update the code to test the property limitResults
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property npaNxx (base name: "NpaNxx")', function() {
      // uncomment below and update the code to test the property npaNxx
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

    it('should have the property fips (base name: "Fips")', function() {
      // uncomment below and update the code to test the property fips
      //var instane = new SaasPro.PCodeLookupRequest();
      //expect(instance).to.be();
    });

  });

}));