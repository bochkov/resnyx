package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a page containing an embedded video player or a video file.
 * By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the video.
 * <p>
 * If an InlineQueryResultVideo message contains an embedded video (e.g., YouTube), you must replace its content using input_message_content.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultVideo implements InlineQueryResult {

    /**
     * Type of the result, must be video
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid URL for the embedded video player or video file
     */
    @JsonProperty("video_url")
    private String url;

    /**
     * MIME type of the content of the video URL, “text/html” or “video/mp4”
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Optional. Video width
     */
    @JsonProperty("video_width")
    private Integer width;

    /**
     * Optional. Video height
     */
    @JsonProperty("video_height")
    private Integer height;

    /**
     * Optional. Video duration in seconds
     */
    @JsonProperty("video_duration")
    private Integer duration;

    /**
     * URL of the thumbnail (JPEG only) for the video
     */
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

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
     * Optional. Content of the message to be sent instead of the video.
     * This field is required if InlineQueryResultVideo is used to send an HTML-page as a result (e.g., a YouTube video).
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
