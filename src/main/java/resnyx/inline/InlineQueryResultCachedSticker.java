package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the sticker.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedSticker implements InlineQueryResult {

    /**
     * Type of the result, must be sticker
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid file identifier of the sticker
     */
    @JsonProperty("sticker_file_id")
    private String fileId;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the video animation
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
