package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the file.
 * Currently, only .PDF and .ZIP files can be sent using this method.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultDocument implements InlineQueryResult {

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

    @JsonUnwrapped
    private Caption caption;

    /**
     * A valid URL for the file
     */
    @JsonProperty("document_url")
    private String url;

    /**
     * MIME type of the content of the file, either “application/pdf” or “application/zip”
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Optional. Short description of the result
     */
    private String description;

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

    /**
     * Optional. URL of the thumbnail (JPEG only) for the file
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
