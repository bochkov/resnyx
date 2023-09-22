package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Place;

/**
 * This object represents a venue.
 */
@Data
@NoArgsConstructor
public final class Venue {

    /**
     * Venue location. Can't be a live location
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

    @JsonUnwrapped(prefix = "foursquare_")
    private Place foursquare;

    @JsonUnwrapped(prefix = "google_place_")
    private Place googlePlace;

}
