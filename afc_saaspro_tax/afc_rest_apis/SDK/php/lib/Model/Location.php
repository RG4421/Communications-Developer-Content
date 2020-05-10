<?php
/**
 * Location
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
 * Location Class Doc Comment
 *
 * @category Class
 * @description Location data used to determine taxing jurisdiction.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class Location implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Location';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cnty' => 'string',
        'ctry' => 'string',
        'int' => 'bool',
        'geo' => 'bool',
        'pcd' => 'int',
        'npa' => 'int',
        'fips' => 'string',
        'addr' => 'string',
        'city' => 'string',
        'st' => 'string',
        'zip' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'cnty' => null,
        'ctry' => null,
        'int' => null,
        'geo' => null,
        'pcd' => 'int32',
        'npa' => 'int32',
        'fips' => null,
        'addr' => null,
        'city' => null,
        'st' => null,
        'zip' => null
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
        'cnty' => 'cnty',
        'ctry' => 'ctry',
        'int' => 'int',
        'geo' => 'geo',
        'pcd' => 'pcd',
        'npa' => 'npa',
        'fips' => 'fips',
        'addr' => 'addr',
        'city' => 'city',
        'st' => 'st',
        'zip' => 'zip'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cnty' => 'setCnty',
        'ctry' => 'setCtry',
        'int' => 'setInt',
        'geo' => 'setGeo',
        'pcd' => 'setPcd',
        'npa' => 'setNpa',
        'fips' => 'setFips',
        'addr' => 'setAddr',
        'city' => 'setCity',
        'st' => 'setSt',
        'zip' => 'setZip'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cnty' => 'getCnty',
        'ctry' => 'getCtry',
        'int' => 'getInt',
        'geo' => 'getGeo',
        'pcd' => 'getPcd',
        'npa' => 'getNpa',
        'fips' => 'getFips',
        'addr' => 'getAddr',
        'city' => 'getCity',
        'st' => 'getSt',
        'zip' => 'getZip'
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
        $this->container['cnty'] = isset($data['cnty']) ? $data['cnty'] : null;
        $this->container['ctry'] = isset($data['ctry']) ? $data['ctry'] : null;
        $this->container['int'] = isset($data['int']) ? $data['int'] : null;
        $this->container['geo'] = isset($data['geo']) ? $data['geo'] : null;
        $this->container['pcd'] = isset($data['pcd']) ? $data['pcd'] : null;
        $this->container['npa'] = isset($data['npa']) ? $data['npa'] : null;
        $this->container['fips'] = isset($data['fips']) ? $data['fips'] : null;
        $this->container['addr'] = isset($data['addr']) ? $data['addr'] : null;
        $this->container['city'] = isset($data['city']) ? $data['city'] : null;
        $this->container['st'] = isset($data['st']) ? $data['st'] : null;
        $this->container['zip'] = isset($data['zip']) ? $data['zip'] : null;
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
     * Gets cnty
     *
     * @return string|null
     */
    public function getCnty()
    {
        return $this->container['cnty'];
    }

    /**
     * Sets cnty
     *
     * @param string|null $cnty County name.
     *
     * @return $this
     */
    public function setCnty($cnty)
    {
        $this->container['cnty'] = $cnty;

        return $this;
    }

    /**
     * Gets ctry
     *
     * @return string|null
     */
    public function getCtry()
    {
        return $this->container['ctry'];
    }

    /**
     * Sets ctry
     *
     * @param string|null $ctry Country ISO code.
     *
     * @return $this
     */
    public function setCtry($ctry)
    {
        $this->container['ctry'] = $ctry;

        return $this;
    }

    /**
     * Gets int
     *
     * @return bool|null
     */
    public function getInt()
    {
        return $this->container['int'];
    }

    /**
     * Sets int
     *
     * @param bool|null $int Indicates if the location is within city limits.  Default: true.
     *
     * @return $this
     */
    public function setInt($int)
    {
        $this->container['int'] = $int;

        return $this;
    }

    /**
     * Gets geo
     *
     * @return bool|null
     */
    public function getGeo()
    {
        return $this->container['geo'];
    }

    /**
     * Sets geo
     *
     * @param bool|null $geo Indicates if this address should be geocoded in order to obtain taxing jurisdiction.  Default: false.
     *
     * @return $this
     */
    public function setGeo($geo)
    {
        $this->container['geo'] = $geo;

        return $this;
    }

    /**
     * Gets pcd
     *
     * @return int|null
     */
    public function getPcd()
    {
        return $this->container['pcd'];
    }

    /**
     * Sets pcd
     *
     * @param int|null $pcd PCode for taxing jurisdiction.
     *
     * @return $this
     */
    public function setPcd($pcd)
    {
        $this->container['pcd'] = $pcd;

        return $this;
    }

    /**
     * Gets npa
     *
     * @return int|null
     */
    public function getNpa()
    {
        return $this->container['npa'];
    }

    /**
     * Sets npa
     *
     * @param int|null $npa NPANXX number.
     *
     * @return $this
     */
    public function setNpa($npa)
    {
        $this->container['npa'] = $npa;

        return $this;
    }

    /**
     * Gets fips
     *
     * @return string|null
     */
    public function getFips()
    {
        return $this->container['fips'];
    }

    /**
     * Sets fips
     *
     * @param string|null $fips FIPS code for taxing jurisdiction.
     *
     * @return $this
     */
    public function setFips($fips)
    {
        $this->container['fips'] = $fips;

        return $this;
    }

    /**
     * Gets addr
     *
     * @return string|null
     */
    public function getAddr()
    {
        return $this->container['addr'];
    }

    /**
     * Sets addr
     *
     * @param string|null $addr Street address.
     *
     * @return $this
     */
    public function setAddr($addr)
    {
        $this->container['addr'] = $addr;

        return $this;
    }

    /**
     * Gets city
     *
     * @return string|null
     */
    public function getCity()
    {
        return $this->container['city'];
    }

    /**
     * Sets city
     *
     * @param string|null $city City name.
     *
     * @return $this
     */
    public function setCity($city)
    {
        $this->container['city'] = $city;

        return $this;
    }

    /**
     * Gets st
     *
     * @return string|null
     */
    public function getSt()
    {
        return $this->container['st'];
    }

    /**
     * Sets st
     *
     * @param string|null $st State name or abbreviation.
     *
     * @return $this
     */
    public function setSt($st)
    {
        $this->container['st'] = $st;

        return $this;
    }

    /**
     * Gets zip
     *
     * @return string|null
     */
    public function getZip()
    {
        return $this->container['zip'];
    }

    /**
     * Sets zip
     *
     * @param string|null $zip Postal code.
     *
     * @return $this
     */
    public function setZip($zip)
    {
        $this->container['zip'] = $zip;

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


