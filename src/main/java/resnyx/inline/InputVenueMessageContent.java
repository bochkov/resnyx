package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Place;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 */
@Data
@NoArgsConstructor
public final class InputVenueMessageContent implements InputMessageContent {

    /**
     * Latitude of the venue location in degrees
     */
    private Double latitude;

    /**
     * Longitude of the venue location in degrees
     */
    private Double longitude;

    /**
     * Title of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue if known
     */
    @JsonUnwrapped(prefix = "foursquare_")
    private Place foursquare;

    /**
     * Optional. Google Places identifier of the venue
     */
    @JsonUnwrapped(prefix = "google_place_")
    private Place googlePlace;
}
