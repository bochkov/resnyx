package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A text with a bank card number.
 */
@Data
@NoArgsConstructor
public final class RichTextBankCardNumber implements RichText {

    /**
     * Type of the rich text, always “bank_card_number”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The bank card number
     */
    @JsonProperty("bank_card_number")
    private String bankCardNumber;
}
