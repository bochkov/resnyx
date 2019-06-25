package resnyx.model;

import lombok.Data;

/**
 * This object represents a point on the map.
 */
@Data
public final class Location {

    /**
     * Longitude as defined by sender
     */
    private Double longitude;

    /**
     * Latitude as defined by sender
     */
    private Double latitude;
}
