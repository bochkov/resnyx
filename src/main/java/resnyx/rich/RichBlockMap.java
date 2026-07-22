package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;

/**
 * A block with a map, corresponding to the custom HTML tag &lt;tg-map&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockMap implements RichBlock {

    /**
     * Type of the block, always “map”
     */
    private String type;

    /**
     * Location of the center of the map
     */
    private Location location;

    /**
     * Map zoom level; 13-20
     */
    private Integer zoom;

    /**
     * Expected width of the map
     */
    private Integer width;

    /**
     * Expected height of the map
     */
    private Integer height;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;

}
