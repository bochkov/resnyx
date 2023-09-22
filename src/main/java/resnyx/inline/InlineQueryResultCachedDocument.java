package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a file stored on the Telegram servers.
 * By default, this file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the file.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedDocument implements InlineQueryResult {

    /**
     * Type of the result, must be document
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * Title for the result
     */
    private String title;

    /**
     * A valid file identifier for the file
     */
    @JsonProperty("document_file_id")
    private String fileId;

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
     * Optional. Content of the message to be sent instead of the file
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

}
