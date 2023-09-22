package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a photo stored on the Telegram servers.
 * By default, this photo will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the photo.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedPhoto implements InlineQueryResult {

    /**
     * Type of the result, must be photo
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid file identifier of the photo
     */
    @JsonProperty("photo_file_id")
    private String fileId;

    /**
     * Optional. Title for the result
     */
    private String title;

    /**
     * Optional. Short description of the result
     */
    private String description;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the photo
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
