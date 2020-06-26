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

import ApiClient from '../ApiClient';

/**
 * The LocationItem model module.
 * @module model/LocationItem
 * @version v2
 */
class LocationItem {
    /**
     * Constructs a new <code>LocationItem</code>.
     * @alias module:model/LocationItem
     */
    constructor() { 
        
        LocationItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LocationItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LocationItem} obj Optional instance to populate.
     * @return {module:model/LocationItem} The populated <code>LocationItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LocationItem();

            if (data.hasOwnProperty('IsAlternate')) {
                obj['IsAlternate'] = ApiClient.convertToType(data['IsAlternate'], 'Boolean');
            }
            if (data.hasOwnProperty('CountryIso')) {
                obj['CountryIso'] = ApiClient.convertToType(data['CountryIso'], 'String');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = ApiClient.convertToType(data['State'], 'String');
            }
            if (data.hasOwnProperty('County')) {
                obj['County'] = ApiClient.convertToType(data['County'], 'String');
            }
            if (data.hasOwnProperty('Locality')) {
                obj['Locality'] = ApiClient.convertToType(data['Locality'], 'String');
            }
            if (data.hasOwnProperty('PCode')) {
                obj['PCode'] = ApiClient.convertToType(data['PCode'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} IsAlternate
 */
LocationItem.prototype['IsAlternate'] = undefined;

/**
 * @member {String} CountryIso
 */
LocationItem.prototype['CountryIso'] = undefined;

/**
 * @member {String} State
 */
LocationItem.prototype['State'] = undefined;

/**
 * @member {String} County
 */
LocationItem.prototype['County'] = undefined;

/**
 * @member {String} Locality
 */
LocationItem.prototype['Locality'] = undefined;

/**
 * @member {Number} PCode
 */
LocationItem.prototype['PCode'] = undefined;






export default LocationItem;
