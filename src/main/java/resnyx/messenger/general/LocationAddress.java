package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes the physical address of a location.
 */
@Data
@NoArgsConstructor
public final class LocationAddress {

    /**
     * The two-letter ISO 3166-1 alpha-2 country code of the country where the location is located
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * Optional. State of the location
     */
    private String state;

    /**
     * Optional. City of the location
     */
    private String city;

    /**
     * Optional. Street address of the location
     */
    private String street;
}
