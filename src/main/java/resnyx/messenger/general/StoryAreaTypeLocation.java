package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a story area pointing to a location. Currently, a story can have up to 10 location areas.
 */
@Data
@NoArgsConstructor
public final class StoryAreaTypeLocation implements StoryAreaType {

    /**
     * Type of the area, always “location”
     */
    private String type;

    /**
     * Location latitude in degrees
     */
    private Double latitude;

    /**
     * Location longitude in degrees
     */
    private Double longitude;

    /**
     * Optional. Address of the location
     */
    private LocationAddress address;
}
