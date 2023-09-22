package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the contact.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultContact implements InlineQueryResult {

    /**
     * Type of the result, must be contact
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

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

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the contact
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

    /**
     * Optional. Url of the thumbnail for the result
     */
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    /**
     * Optional. Thumbnail width
     */
    @JsonProperty("thumbnail_width")
    private Integer thumbnailWidth;

    /**
     * Optional. Thumbnail height
     */
    @JsonProperty("thumbnail_height")
    private Integer thumbnailHeight;
}
