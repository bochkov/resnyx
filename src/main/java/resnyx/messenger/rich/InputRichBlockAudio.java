package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMediaAudio;

/**
 * A block with a music file, corresponding to the HTML tag &lt;audio&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockAudio implements InputRichBlock {

    /**
     * Type of the block, always “audio”
     */
    private String type;

    /**
     * The audio. Caption is ignored.
     */
    private InputMediaAudio audio;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
