package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text with a phone number.
 */
@Data
@NoArgsConstructor
public final class RichTextPhoneNumber implements RichText {

    /**
     * Type of the rich text, always “phone_number”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber;
}
