# coding: utf-8

"""
    SaasPro

    APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.  # noqa: E501

    The version of the OpenAPI document: v2
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import avalara.comms.rest.v2
from avalara.comms.rest.v2.api.health_check_api import HealthCheckApi  # noqa: E501
from avalara.comms.rest.v2.rest import ApiException


class TestHealthCheckApi(unittest.TestCase):
    """HealthCheckApi unit test stubs"""

    def setUp(self):
        self.api = avalara.comms.rest.v2.api.health_check_api.HealthCheckApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_api_v2_health_check_get(self):
        """Test case for api_v2_health_check_get

        Health check that confirms the service is operational and ready to use  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
