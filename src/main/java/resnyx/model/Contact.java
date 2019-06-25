package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a phone contact.
 */
@Data
public final class Contact {

    /**
     * Contact's phone number
     */
    @JsonProperty("phone_number")
    private String phone;

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
     * Optional. Contact's user identifier in Telegram
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Optional. Additional data about the contact
     * in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>
     */
    private String vcard;
}
