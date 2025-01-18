package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to an article or web page.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultArticle implements InlineQueryResult {

    /**
     * Type of the result, must be article
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 Bytes
     */
    private String id;

    /**
     * Title of the result
     */
    private String title;

    /**
     * Content of the message to be sent
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. URL of the result
     */
    private String url;

    /**
     * Optional. Short description of the result
     */
    private String description;

    /**
     * Optional. Url of the thumbnail for the result
     */
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    /**
     * Optional. Thumbnail width
     */
    @JsonProperty("thumbnail_width")
    private String thumbnailWidth;

    /**
     * Optional. Thumbnail height
     */
    @JsonProperty("thumbnail_height")
    private String thumbnailHeight;

}
