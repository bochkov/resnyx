package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A cashtag.
 */
@Data
@NoArgsConstructor
public final class RichTextCashtag implements RichText {

    /**
     * Type of the rich text, always “cashtag”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The cashtag
     */
    private String cashtag;
}
