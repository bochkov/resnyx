package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a venue to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaVenue implements InputMedia, InputPollMedia, InputPollOptionMedia {

    /**
     * Type of the result, must be venue
     */
    @JsonProperty("type")
    private String type;

    /**
     * Latitude of the location
     */
    @JsonProperty("latitude")
    private Float latitude;

    /**
     * Longitude of the location
     */
    @JsonProperty("longitude")
    private Float longitude;

    /**
     * Name of the venue
     */
    @JsonProperty("title")
    private String title;

    /**
     * Address of the venue
     */
    @JsonProperty("address")
    private String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String foursquareId;

    /**
     * Optional. Foursquare type of the venue, if known.
     * (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("v")
    private String foursquareType;

    /**
     * Optional. Google Places identifier of the venue
     */
    @JsonProperty("google_place_id")
    private String googlePlaceId;

    /**
     * Optional. Google Places type of the venue.
     * (See <a href="https://developers.google.com/places/web-service/supported_types">supported types</a>.)
     */
    @JsonProperty("google_place_type")
    private String googlePlaceType;
}
