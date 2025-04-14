package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a clickable area on a story media.
 */
@Data
@NoArgsConstructor
public final class StoryArea {

    /**
     * Position of the area
     */
    private StoryAreaPosition position;

    /**
     * Type of the area
     */
    private StoryAreaType type;
}
