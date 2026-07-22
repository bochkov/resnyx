package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text with an email address.
 */
@Data
@NoArgsConstructor
public final class RichTextEmailAddress implements RichText {

    /**
     * Type of the rich text, always “email_address”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The email address
     */
    @JsonProperty("email_address")
    private String emailAddress;
}
