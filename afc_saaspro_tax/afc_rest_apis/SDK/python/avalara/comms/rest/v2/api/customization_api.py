# coding: utf-8

"""
    SaasPro

    APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.  # noqa: E501

    The version of the OpenAPI document: v2
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from avalara.comms.rest.v2.api_client import ApiClient
from avalara.comms.rest.v2.exceptions import (
    ApiTypeError,
    ApiValueError
)


class CustomizationApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def api_v2_profiles_get_profiles_get(self, **kwargs):  # noqa: E501
        """Retrieves one or more profiles with associated settings and configurable items  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.api_v2_profiles_get_profiles_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param int requested_client_id: Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.
        :param int requested_profile_id: Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.
        :param TaxCalculationSettingTypes item_type: Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: TaxCalculationSettingsResponse
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.api_v2_profiles_get_profiles_get_with_http_info(**kwargs)  # noqa: E501

    def api_v2_profiles_get_profiles_get_with_http_info(self, **kwargs):  # noqa: E501
        """Retrieves one or more profiles with associated settings and configurable items  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.api_v2_profiles_get_profiles_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param int requested_client_id: Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.
        :param int requested_profile_id: Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.
        :param TaxCalculationSettingTypes item_type: Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(TaxCalculationSettingsResponse, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['requested_client_id', 'requested_profile_id', 'item_type']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method api_v2_profiles_get_profiles_get" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'requested_client_id' in local_var_params and local_var_params['requested_client_id'] is not None:  # noqa: E501
            query_params.append(('RequestedClientId', local_var_params['requested_client_id']))  # noqa: E501
        if 'requested_profile_id' in local_var_params and local_var_params['requested_profile_id'] is not None:  # noqa: E501
            query_params.append(('RequestedProfileId', local_var_params['requested_profile_id']))  # noqa: E501
        if 'item_type' in local_var_params and local_var_params['item_type'] is not None:  # noqa: E501
            query_params.append(('ItemType', local_var_params['item_type']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain', 'application/json', 'text/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['Basic']  # noqa: E501

        return self.api_client.call_api(
            '/api/v2/profiles/GetProfiles', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='TaxCalculationSettingsResponse',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
