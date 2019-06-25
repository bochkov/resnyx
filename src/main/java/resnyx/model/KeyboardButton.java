package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents one button of the reply keyboard.
 * For simple text buttons String can be used instead of this object to
 * specify text of the button. Optional fields are mutually exclusive.
 */
@Data
public final class KeyboardButton {

    /**
     * Text of the button. If none of the optional fields are used,
     * it will be sent as a message when the button is pressed
     */
    private String text;

    /**
     * Optional. If True, the user's phone number will be sent as a contact
     * when the button is pressed. Available in private chats only
     */
    @JsonProperty("request_contact")
    private Boolean requestContact;

    /**
     * Optional. If True, the user's current location will be sent when the button is pressed.
     * Available in private chats only
     */
    @JsonProperty("request_location")
    private Boolean requestLocation;
}
