<?php
/**
 * TaxCalculationSettingsResponse
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * TaxCalculationSettingsResponse Class Doc Comment
 *
 * @category Class
 * @description Data for an invoice or quote line item.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class TaxCalculationSettingsResponse implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'TaxCalculationSettingsResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'profile_config_id' => 'int',
        'profile_ids' => 'int[]',
        'client_id' => 'int',
        'last_update_by' => 'string',
        'active' => 'bool',
        'settings' => '\OpenAPI\Client\Model\Configuration',
        'exclusions' => '\OpenAPI\Client\Model\ExclusionConfig[]',
        'bundles' => '\OpenAPI\Client\Model\BundleConfig[]',
        'nexus' => '\OpenAPI\Client\Model\NexusConfig[]',
        'overrides' => '\OpenAPI\Client\Model\OverrideConfig',
        'description' => 'string',
        'error' => 'string',
        'item_type' => 'string',
        'errors' => '\OpenAPI\Client\Model\Error[]',
        'warnings' => '\OpenAPI\Client\Model\Warning[]',
        'status' => '\OpenAPI\Client\Model\Status[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'profile_config_id' => 'int64',
        'profile_ids' => 'int32',
        'client_id' => 'int32',
        'last_update_by' => null,
        'active' => null,
        'settings' => null,
        'exclusions' => null,
        'bundles' => null,
        'nexus' => null,
        'overrides' => null,
        'description' => null,
        'error' => null,
        'item_type' => null,
        'errors' => null,
        'warnings' => null,
        'status' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'profile_config_id' => 'ProfileConfigId',
        'profile_ids' => 'ProfileIds',
        'client_id' => 'ClientId',
        'last_update_by' => 'LastUpdateBy',
        'active' => 'Active',
        'settings' => 'Settings',
        'exclusions' => 'Exclusions',
        'bundles' => 'Bundles',
        'nexus' => 'Nexus',
        'overrides' => 'Overrides',
        'description' => 'Description',
        'error' => 'Error',
        'item_type' => 'ItemType',
        'errors' => 'Errors',
        'warnings' => 'Warnings',
        'status' => 'Status'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'profile_config_id' => 'setProfileConfigId',
        'profile_ids' => 'setProfileIds',
        'client_id' => 'setClientId',
        'last_update_by' => 'setLastUpdateBy',
        'active' => 'setActive',
        'settings' => 'setSettings',
        'exclusions' => 'setExclusions',
        'bundles' => 'setBundles',
        'nexus' => 'setNexus',
        'overrides' => 'setOverrides',
        'description' => 'setDescription',
        'error' => 'setError',
        'item_type' => 'setItemType',
        'errors' => 'setErrors',
        'warnings' => 'setWarnings',
        'status' => 'setStatus'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'profile_config_id' => 'getProfileConfigId',
        'profile_ids' => 'getProfileIds',
        'client_id' => 'getClientId',
        'last_update_by' => 'getLastUpdateBy',
        'active' => 'getActive',
        'settings' => 'getSettings',
        'exclusions' => 'getExclusions',
        'bundles' => 'getBundles',
        'nexus' => 'getNexus',
        'overrides' => 'getOverrides',
        'description' => 'getDescription',
        'error' => 'getError',
        'item_type' => 'getItemType',
        'errors' => 'getErrors',
        'warnings' => 'getWarnings',
        'status' => 'getStatus'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['profile_config_id'] = isset($data['profile_config_id']) ? $data['profile_config_id'] : null;
        $this->container['profile_ids'] = isset($data['profile_ids']) ? $data['profile_ids'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['last_update_by'] = isset($data['last_update_by']) ? $data['last_update_by'] : null;
        $this->container['active'] = isset($data['active']) ? $data['active'] : null;
        $this->container['settings'] = isset($data['settings']) ? $data['settings'] : null;
        $this->container['exclusions'] = isset($data['exclusions']) ? $data['exclusions'] : null;
        $this->container['bundles'] = isset($data['bundles']) ? $data['bundles'] : null;
        $this->container['nexus'] = isset($data['nexus']) ? $data['nexus'] : null;
        $this->container['overrides'] = isset($data['overrides']) ? $data['overrides'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['error'] = isset($data['error']) ? $data['error'] : null;
        $this->container['item_type'] = isset($data['item_type']) ? $data['item_type'] : null;
        $this->container['errors'] = isset($data['errors']) ? $data['errors'] : null;
        $this->container['warnings'] = isset($data['warnings']) ? $data['warnings'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets profile_config_id
     *
     * @return int|null
     */
    public function getProfileConfigId()
    {
        return $this->container['profile_config_id'];
    }

    /**
     * Sets profile_config_id
     *
     * @param int|null $profile_config_id Unique profile configuration id associated with configuration item
     *
     * @return $this
     */
    public function setProfileConfigId($profile_config_id)
    {
        $this->container['profile_config_id'] = $profile_config_id;

        return $this;
    }

    /**
     * Gets profile_ids
     *
     * @return int[]|null
     */
    public function getProfileIds()
    {
        return $this->container['profile_ids'];
    }

    /**
     * Sets profile_ids
     *
     * @param int[]|null $profile_ids Profile id's associated with configuration item
     *
     * @return $this
     */
    public function setProfileIds($profile_ids)
    {
        $this->container['profile_ids'] = $profile_ids;

        return $this;
    }

    /**
     * Gets client_id
     *
     * @return int|null
     */
    public function getClientId()
    {
        return $this->container['client_id'];
    }

    /**
     * Sets client_id
     *
     * @param int|null $client_id Client id associated with configuration item
     *
     * @return $this
     */
    public function setClientId($client_id)
    {
        $this->container['client_id'] = $client_id;

        return $this;
    }

    /**
     * Gets last_update_by
     *
     * @return string|null
     */
    public function getLastUpdateBy()
    {
        return $this->container['last_update_by'];
    }

    /**
     * Sets last_update_by
     *
     * @param string|null $last_update_by User who last updated the configuration item
     *
     * @return $this
     */
    public function setLastUpdateBy($last_update_by)
    {
        $this->container['last_update_by'] = $last_update_by;

        return $this;
    }

    /**
     * Gets active
     *
     * @return bool|null
     */
    public function getActive()
    {
        return $this->container['active'];
    }

    /**
     * Sets active
     *
     * @param bool|null $active Active status of the configuration item
     *
     * @return $this
     */
    public function setActive($active)
    {
        $this->container['active'] = $active;

        return $this;
    }

    /**
     * Gets settings
     *
     * @return \OpenAPI\Client\Model\Configuration|null
     */
    public function getSettings()
    {
        return $this->container['settings'];
    }

    /**
     * Sets settings
     *
     * @param \OpenAPI\Client\Model\Configuration|null $settings settings
     *
     * @return $this
     */
    public function setSettings($settings)
    {
        $this->container['settings'] = $settings;

        return $this;
    }

    /**
     * Gets exclusions
     *
     * @return \OpenAPI\Client\Model\ExclusionConfig[]|null
     */
    public function getExclusions()
    {
        return $this->container['exclusions'];
    }

    /**
     * Sets exclusions
     *
     * @param \OpenAPI\Client\Model\ExclusionConfig[]|null $exclusions Exclusions (as applicable)
     *
     * @return $this
     */
    public function setExclusions($exclusions)
    {
        $this->container['exclusions'] = $exclusions;

        return $this;
    }

    /**
     * Gets bundles
     *
     * @return \OpenAPI\Client\Model\BundleConfig[]|null
     */
    public function getBundles()
    {
        return $this->container['bundles'];
    }

    /**
     * Sets bundles
     *
     * @param \OpenAPI\Client\Model\BundleConfig[]|null $bundles Bundles (as applicable)
     *
     * @return $this
     */
    public function setBundles($bundles)
    {
        $this->container['bundles'] = $bundles;

        return $this;
    }

    /**
     * Gets nexus
     *
     * @return \OpenAPI\Client\Model\NexusConfig[]|null
     */
    public function getNexus()
    {
        return $this->container['nexus'];
    }

    /**
     * Sets nexus
     *
     * @param \OpenAPI\Client\Model\NexusConfig[]|null $nexus Nexus (as applicable)
     *
     * @return $this
     */
    public function setNexus($nexus)
    {
        $this->container['nexus'] = $nexus;

        return $this;
    }

    /**
     * Gets overrides
     *
     * @return \OpenAPI\Client\Model\OverrideConfig|null
     */
    public function getOverrides()
    {
        return $this->container['overrides'];
    }

    /**
     * Sets overrides
     *
     * @param \OpenAPI\Client\Model\OverrideConfig|null $overrides overrides
     *
     * @return $this
     */
    public function setOverrides($overrides)
    {
        $this->container['overrides'] = $overrides;

        return $this;
    }

    /**
     * Gets description
     *
     * @return string|null
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string|null $description Description associated with this item
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets error
     *
     * @return string|null
     */
    public function getError()
    {
        return $this->container['error'];
    }

    /**
     * Sets error
     *
     * @param string|null $error Error information.
     *
     * @return $this
     */
    public function setError($error)
    {
        $this->container['error'] = $error;

        return $this;
    }

    /**
     * Gets item_type
     *
     * @return string|null
     */
    public function getItemType()
    {
        return $this->container['item_type'];
    }

    /**
     * Sets item_type
     *
     * @param string|null $item_type Item Type  Examples:    Configuration, Bundle, Exclusion, Override
     *
     * @return $this
     */
    public function setItemType($item_type)
    {
        $this->container['item_type'] = $item_type;

        return $this;
    }

    /**
     * Gets errors
     *
     * @return \OpenAPI\Client\Model\Error[]|null
     */
    public function getErrors()
    {
        return $this->container['errors'];
    }

    /**
     * Sets errors
     *
     * @param \OpenAPI\Client\Model\Error[]|null $errors Error information.
     *
     * @return $this
     */
    public function setErrors($errors)
    {
        $this->container['errors'] = $errors;

        return $this;
    }

    /**
     * Gets warnings
     *
     * @return \OpenAPI\Client\Model\Warning[]|null
     */
    public function getWarnings()
    {
        return $this->container['warnings'];
    }

    /**
     * Sets warnings
     *
     * @param \OpenAPI\Client\Model\Warning[]|null $warnings Warning information.
     *
     * @return $this
     */
    public function setWarnings($warnings)
    {
        $this->container['warnings'] = $warnings;

        return $this;
    }

    /**
     * Gets status
     *
     * @return \OpenAPI\Client\Model\Status[]|null
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param \OpenAPI\Client\Model\Status[]|null $status Status information.
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


