package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a story area pointing to an HTTP or tg:// link. Currently, a story can have up to 3 link areas.
 */
@Data
@NoArgsConstructor
public final class StoryAreaTypeLink implements StoryAreaType {

    /**
     * Type of the area, always “link”
     */
    private String type;

    /**
     * HTTP or tg:// URL to be opened when the area is clicked
     */
    private String url;
}
