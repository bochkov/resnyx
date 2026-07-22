package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A link to a reference.
 */
@Data
@NoArgsConstructor
public final class RichTextReferenceLink implements RichText {

    /**
     * Type of the rich text, always “reference_link”
     */
    private String type;

    /**
     * The link text
     */
    private RichText text;

    /**
     * The name of the reference
     */
    @JsonProperty("reference_name")
    private String referenceName;
}
