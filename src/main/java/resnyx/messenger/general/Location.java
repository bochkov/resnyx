package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a point on the map.
 */
@Data
@NoArgsConstructor
public final class Location {

    /**
     * Longitude as defined by sender
     */
    private Double longitude;

    /**
     * Latitude as defined by sender
     */
    private Double latitude;

    /**
     * Optional. The radius of uncertainty for the location, measured in meters; 0-1500
     */
    @JsonProperty("horizontal_accuracy")
    private Double horizontalAccuracy;

    /**
     * Optional. Time relative to the message sending date, during which the location can be updated; in seconds.
     * For active live locations only.
     */
    @JsonProperty("live_period")
    private Integer livePeriod;

    /**
     * Optional. The direction in which user is moving, in degrees; 1-360.
     * For active live locations only.
     */
    private Integer heading;

    /**
     * Optional. The maximum distance for proximity alerts about approaching another chat member, in meters.
     * For sent live locations only.
     */
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius;
}
