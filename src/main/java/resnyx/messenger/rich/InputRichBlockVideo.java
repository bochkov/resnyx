package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMediaVideo;

/**
 * A block with a video, corresponding to the HTML tag &lt;video&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockVideo implements InputRichBlock {

    /**
     * Type of the block, always “video”
     */
    private String type;

    /**
     * The video. Caption is ignored.
     */
    private InputMediaVideo video;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
