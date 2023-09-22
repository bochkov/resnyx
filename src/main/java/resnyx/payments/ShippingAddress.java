package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a shipping address.
 */
@Data
@NoArgsConstructor
public final class ShippingAddress {

    /**
     * Two-letter ISO 3166-1 alpha-2 country code
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * State, if applicable
     */
    private String state;

    /**
     * City
     */
    private String city;

    /**
     * First line for the address
     */
    @JsonProperty("street_line1")
    private String streetLine1;

    /**
     * Second line for the address
     */
    @JsonProperty("street_line2")
    private String streetLine2;

    /**
     * Address post code
     */
    @JsonProperty("post_code")
    private String postCode;
}
