package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMediaAnimation;

/**
 * A block with an animation, corresponding to the HTML tag &lt;video&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockAnimation implements InputRichBlock {

    /**
     * Type of the block, always “animation”
     */
    private String type;

    /**
     * The animation. Caption is ignored.
     */
    private InputMediaAnimation animation;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
