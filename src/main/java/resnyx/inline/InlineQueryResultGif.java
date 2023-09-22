package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to an animated GIF file. By default, this animated GIF file will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the animation.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultGif implements InlineQueryResult {

    /**
     * Type of the result, must be gif
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid URL for the GIF file. File size must not exceed 1MB
     */
    @JsonProperty("gif_url")
    private String url;

    /**
     * Optional. Width of the GIF
     */
    @JsonProperty("gif_width")
    private Integer width;

    /**
     * Optional. Height of the GIF
     */
    @JsonProperty("gif_height")
    private Integer height;

    /**
     * Optional. Duration of the GIF in seconds
     */
    @JsonProperty("gif_duration")
    private Integer duration;

    /**
     * URL of the thumbnail for the photo
     */
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    /**
     * Optional. MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”.
     * Defaults to “image/jpeg”
     */
    @JsonProperty("thumbnail_mime_type")
    private String thumbnailMimeType;

    /**
     * Optional. Title for the result
     */
    private String title;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the GIF animation
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
