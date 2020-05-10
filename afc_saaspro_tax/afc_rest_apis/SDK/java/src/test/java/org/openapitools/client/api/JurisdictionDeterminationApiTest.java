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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.GeoBatchLog;
import org.openapitools.client.model.GeoBatchStatus;
import org.openapitools.client.model.GeoBatchSubmitFileResponse;
import org.openapitools.client.model.GeocodeRequest;
import org.openapitools.client.model.GeocodeResult;
import org.openapitools.client.model.PCodeLookupRequest;
import org.openapitools.client.model.PCodeLookupResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JurisdictionDeterminationApi
 */
@Ignore
public class JurisdictionDeterminationApiTest {

    private final JurisdictionDeterminationApi api = new JurisdictionDeterminationApi();

    
    /**
     * Get PCode(s) associated with a location - Ctry/State/County/City/Zip/NpaNxx/Fips.
     *
     * Requests supports using best match or exact match as well as limiting the number of matches returned. Use a * on the end of Fips/Npanxx Codes to find a range of values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2AfcPCodePostTest() throws ApiException {
        PCodeLookupRequest pcodeLookupRequest = null;
        PCodeLookupResult response = api.apiV2AfcPCodePost(pcodeLookupRequest);

        // TODO: test validations
    }
    
    /**
     * Retrieves log on Geo Batch file
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2GeoBatchLogProcessIdGetTest() throws ApiException {
        String processId = null;
        GeoBatchLog response = api.apiV2GeoBatchLogProcessIdGet(processId);

        // TODO: test validations
    }
    
    /**
     * Retrieves information on Geo Batch file status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2GeoBatchStatusProcessIdGetTest() throws ApiException {
        String processId = null;
        GeoBatchStatus response = api.apiV2GeoBatchStatusProcessIdGet(processId);

        // TODO: test validations
    }
    
    /**
     * Uploads file to Geo Batch.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2GeoBatchUploadPostTest() throws ApiException {
        File geoBatchFile = null;
        GeoBatchSubmitFileResponse response = api.apiV2GeoBatchUploadPost(geoBatchFile);

        // TODO: test validations
    }
    
    /**
     * Geocodes one or multiple street addresses and/or lat/long coordinate pairs.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2GeoGeocodePostTest() throws ApiException {
        List<GeocodeRequest> geocodeRequest = null;
        List<GeocodeResult> response = api.apiV2GeoGeocodePost(geocodeRequest);

        // TODO: test validations
    }
    
}
