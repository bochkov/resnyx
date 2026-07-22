package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Audio;

/**
 * A block with a music file, corresponding to the HTML tag &lt;audio&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockAudio implements RichBlock {

    /**
     * Type of the block, always “audio”
     */
    private String type;

    /**
     * The audio
     */
    private Audio audio;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
