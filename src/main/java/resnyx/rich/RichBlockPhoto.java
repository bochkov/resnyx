package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PhotoSize;

import java.util.List;

/**
 * A block with a photo, corresponding to the HTML tag &lt;img&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockPhoto implements RichBlock {

    /**
     * Type of the block, always “photo”
     */
    private String type;

    /**
     * Available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * Optional. True, if the media preview is covered by a spoiler animation
     */
    @JsonProperty("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
