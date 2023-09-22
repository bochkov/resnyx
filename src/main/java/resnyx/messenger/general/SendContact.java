package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.SendOptions;

/**
 * Use this method to send phone contacts. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendContact implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Contact's phone number
     */
    @JsonProperty("phone_number")
    private final String phoneNumber;

    /**
     * Contact's first name
     */
    @JsonProperty("first_name")
    private final String firstName;

    /**
     * Contact's last name
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    @JsonProperty("vcard")
    private String vCard;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
