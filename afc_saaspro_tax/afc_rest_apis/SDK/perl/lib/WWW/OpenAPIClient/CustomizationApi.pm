=begin comment

SaasPro

APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.

The version of the OpenAPI document: v2

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::CustomizationApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# api_v2_profiles_get_profiles_get
#
# Retrieves one or more profiles with associated settings and configurable items
# 
# @param int $requested_client_id Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable. (optional)
# @param int $requested_profile_id Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set. (optional)
# @param TaxCalculationSettingTypes $item_type Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All (optional)
{
    my $params = {
    'requested_client_id' => {
        data_type => 'int',
        description => 'Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.',
        required => '0',
    },
    'requested_profile_id' => {
        data_type => 'int',
        description => 'Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.',
        required => '0',
    },
    'item_type' => {
        data_type => 'TaxCalculationSettingTypes',
        description => 'Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'api_v2_profiles_get_profiles_get' } = { 
        summary => 'Retrieves one or more profiles with associated settings and configurable items',
        params => $params,
        returns => 'TaxCalculationSettingsResponse',
        };
}
# @return TaxCalculationSettingsResponse
#
sub api_v2_profiles_get_profiles_get {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/api/v2/profiles/GetProfiles';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'requested_client_id'}) {
        $query_params->{'RequestedClientId'} = $self->{api_client}->to_query_value($args{'requested_client_id'});
    }

    # query params
    if ( exists $args{'requested_profile_id'}) {
        $query_params->{'RequestedProfileId'} = $self->{api_client}->to_query_value($args{'requested_profile_id'});
    }

    # query params
    if ( exists $args{'item_type'}) {
        $query_params->{'ItemType'} = $self->{api_client}->to_query_value($args{'item_type'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(Basic )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('TaxCalculationSettingsResponse', $response);
    return $_response_object;
}

1;