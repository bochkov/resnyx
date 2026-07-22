package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Caption of a rich formatted block.
 */
@Data
@NoArgsConstructor
public final class RichBlockCaption implements RichBlock {

    /**
     * Block caption
     */
    private RichText text;

    /**
     * Optional. Block credit which corresponds to the HTML tag <cite>
     */
    private RichText caption;

}
