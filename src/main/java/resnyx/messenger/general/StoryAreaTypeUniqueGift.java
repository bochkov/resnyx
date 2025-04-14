package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a story area pointing to a unique gift. Currently, a story can have at most 1 unique gift area.
 */
@Data
@NoArgsConstructor
public final class StoryAreaTypeUniqueGift implements StoryAreaType {

    /**
     * Type of the area, always “unique_gift”
     */
    private String type;

    /**
     * Unique name of the gift
     */
    private String name;
}
