=begin
#SaasPro

#APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.

The version of the OpenAPI document: v2

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.0-SNAPSHOT

=end

require 'date'

module OpenapiClient
  # Tax data for summarized invoice taxes.
  class SummarizedTax
    # Maximum base for tax bracket.
    attr_accessor :max

    # Minimum base for tax bracket.
    attr_accessor :min

    # Total charge amount.
    attr_accessor :tchg

    # Calculation type.
    attr_accessor :calc

    # Tax category name.
    attr_accessor :cat

    # Tax category ID.
    attr_accessor :cid

    # Tax name.
    attr_accessor :name

    # Exempt sale amount.
    attr_accessor :exm

    # Lines.
    attr_accessor :lns

    # PCode for reporting jurisdiction.
    attr_accessor :pcd

    # PCode for taxing jurisdiction.  Only returned if return extended tax data flag is true
    attr_accessor :taxpcd

    # Tax rate.
    attr_accessor :rate

    # Indicates if this tax is a surcharge.
    attr_accessor :sur

    # Tax amount.
    attr_accessor :tax

    # Tax level ID.
    attr_accessor :lvl

    # Tax type ID.
    attr_accessor :tid

    # Flag indicating if tax was user exempted  Only returned if return extended tax data flag is true
    attr_accessor :usexm

    # Flag indicating the item is a no tax entry  There were no taxes generated, this entry is to convey back the taxing jurisdiction that was used in the response  Only returned if return extended tax data flag is true
    attr_accessor :notax

    # Transaction type used to calculate tax  For bundles will be specific bundled item transaction type  Only returned if return extended tax data flag is true
    attr_accessor :trans

    # Service type used to calculate tax  For bundles will be specific bundled item service type  Only returned if return extended tax data flag is true
    attr_accessor :svc

    # Charge used to calculate tax  For bundles will be the percentage of charge applied to bundled item  For tax inclusive calls will be the calculated charge  Only returned if return extended tax data flag is true
    attr_accessor :chg

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'max' => :'max',
        :'min' => :'min',
        :'tchg' => :'tchg',
        :'calc' => :'calc',
        :'cat' => :'cat',
        :'cid' => :'cid',
        :'name' => :'name',
        :'exm' => :'exm',
        :'lns' => :'lns',
        :'pcd' => :'pcd',
        :'taxpcd' => :'taxpcd',
        :'rate' => :'rate',
        :'sur' => :'sur',
        :'tax' => :'tax',
        :'lvl' => :'lvl',
        :'tid' => :'tid',
        :'usexm' => :'usexm',
        :'notax' => :'notax',
        :'trans' => :'trans',
        :'svc' => :'svc',
        :'chg' => :'chg'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'max' => :'Float',
        :'min' => :'Float',
        :'tchg' => :'Float',
        :'calc' => :'Integer',
        :'cat' => :'String',
        :'cid' => :'Integer',
        :'name' => :'String',
        :'exm' => :'Float',
        :'lns' => :'Integer',
        :'pcd' => :'Integer',
        :'taxpcd' => :'Integer',
        :'rate' => :'Float',
        :'sur' => :'Boolean',
        :'tax' => :'Float',
        :'lvl' => :'Integer',
        :'tid' => :'Integer',
        :'usexm' => :'Boolean',
        :'notax' => :'Boolean',
        :'trans' => :'Integer',
        :'svc' => :'Integer',
        :'chg' => :'Float'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'max',
        :'min',
        :'tchg',
        :'calc',
        :'cat',
        :'cid',
        :'name',
        :'exm',
        :'lns',
        :'pcd',
        :'taxpcd',
        :'rate',
        :'sur',
        :'tax',
        :'lvl',
        :'tid',
        :'usexm',
        :'notax',
        :'trans',
        :'svc',
        :'chg'
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::SummarizedTax` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::SummarizedTax`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'max')
        self.max = attributes[:'max']
      end

      if attributes.key?(:'min')
        self.min = attributes[:'min']
      end

      if attributes.key?(:'tchg')
        self.tchg = attributes[:'tchg']
      end

      if attributes.key?(:'calc')
        self.calc = attributes[:'calc']
      end

      if attributes.key?(:'cat')
        self.cat = attributes[:'cat']
      end

      if attributes.key?(:'cid')
        self.cid = attributes[:'cid']
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'exm')
        self.exm = attributes[:'exm']
      end

      if attributes.key?(:'lns')
        self.lns = attributes[:'lns']
      end

      if attributes.key?(:'pcd')
        self.pcd = attributes[:'pcd']
      end

      if attributes.key?(:'taxpcd')
        self.taxpcd = attributes[:'taxpcd']
      end

      if attributes.key?(:'rate')
        self.rate = attributes[:'rate']
      end

      if attributes.key?(:'sur')
        self.sur = attributes[:'sur']
      end

      if attributes.key?(:'tax')
        self.tax = attributes[:'tax']
      end

      if attributes.key?(:'lvl')
        self.lvl = attributes[:'lvl']
      end

      if attributes.key?(:'tid')
        self.tid = attributes[:'tid']
      end

      if attributes.key?(:'usexm')
        self.usexm = attributes[:'usexm']
      end

      if attributes.key?(:'notax')
        self.notax = attributes[:'notax']
      end

      if attributes.key?(:'trans')
        self.trans = attributes[:'trans']
      end

      if attributes.key?(:'svc')
        self.svc = attributes[:'svc']
      end

      if attributes.key?(:'chg')
        self.chg = attributes[:'chg']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          max == o.max &&
          min == o.min &&
          tchg == o.tchg &&
          calc == o.calc &&
          cat == o.cat &&
          cid == o.cid &&
          name == o.name &&
          exm == o.exm &&
          lns == o.lns &&
          pcd == o.pcd &&
          taxpcd == o.taxpcd &&
          rate == o.rate &&
          sur == o.sur &&
          tax == o.tax &&
          lvl == o.lvl &&
          tid == o.tid &&
          usexm == o.usexm &&
          notax == o.notax &&
          trans == o.trans &&
          svc == o.svc &&
          chg == o.chg
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [max, min, tchg, calc, cat, cid, name, exm, lns, pcd, taxpcd, rate, sur, tax, lvl, tid, usexm, notax, trans, svc, chg].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        OpenapiClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end
        
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
