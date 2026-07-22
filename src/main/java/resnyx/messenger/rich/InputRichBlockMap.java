package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;

/**
 * A block with a map, corresponding to the custom HTML tag &lt;tg-map&gt;.
 * The map's width and height must not exceed 10000 in total. The width and height ratio must be at most 20.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockMap implements InputRichBlock {

    /**
     * Type of the block, always “map”
     */
    private String type;

    /**
     *  Location of the center of the map
     */
    private Location location;

    /**
     * Map zoom level; 0-24
     */
    private Integer zoom;

    /**
     * Map width; 0-10000
     */
    private Integer width;

    /**
     * Map height; 0-10000
     */
    private Integer height;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
