package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A link to an anchor.
 */
@Data
@NoArgsConstructor
public final class RichTextAnchorLink implements RichText {

    /**
     * Type of the rich text, always “anchor_link”
     */
    private String type;

    /**
     * The link text
     */
    private RichText text;

    /**
     * The name of the anchor. If the name is empty, then the link brings back to the top of the message.
     */
    @JsonProperty("anchor_name")
    private String anchorName;
}
