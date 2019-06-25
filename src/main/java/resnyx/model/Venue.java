package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a venue.
 */
@Data
public final class Venue {

    /**
     * Venue location
     */
    private Location location;

    /**
     * Name of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    @JsonProperty("foursquare_id")
    private String foursqid;

    /**
     * Optional. Foursquare type of the venue. (For example,
     * “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @JsonProperty("foursquare_type")
    private String foursqtype;
}
