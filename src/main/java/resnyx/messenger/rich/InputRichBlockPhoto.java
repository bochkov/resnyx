package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMediaPhoto;

/**
 * A block with a photo, corresponding to the HTML tag &lt;img&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockPhoto implements InputRichBlock {

    /**
     * Type of the block, always “photo”
     */
    private String type;

    /**
     * The photo. Caption is ignored.
     */
    private InputMediaPhoto photo;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
