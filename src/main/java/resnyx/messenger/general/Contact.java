package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a phone contact.
 */
@Data
@NoArgsConstructor
public final class Contact {

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

    @JsonUnwrapped
    private UserId userId;

    /**
     * Optional. Additional data about the contact in the form of a vCard
     */
    @JsonProperty("vcard")
    private String vCard;
}
