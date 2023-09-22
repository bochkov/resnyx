package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the content of a contact message to be sent as the result of an inline query.
 */
@Data
@NoArgsConstructor
public final class InputContactMessageContent implements InputMessageContent {

    /**
     * Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * Contact's first name
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Optional. Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    private String vCard;
}
