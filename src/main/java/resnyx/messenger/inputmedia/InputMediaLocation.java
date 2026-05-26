package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a location to be sent.
 */
@Data
@NoArgsConstructor
public final class InputMediaLocation implements InputMedia, InputPollMedia, InputPollOptionMedia {

    /**
     * Type of the result, must be location
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
     * Optional. The radius of uncertainty for the location, measured in meters; 0-1500
     */
    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy;
}
