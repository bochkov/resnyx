package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound).
 * By default, this animated MPEG-4 file will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the animation.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultMpeg4Gif implements InlineQueryResult {

    /**
     * Type of the result, must be mpeg4_gif
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid URL for the MPEG4 file. File size must not exceed 1MB
     */
    @JsonProperty("mpeg4_url")
    private String url;

    /**
     * Optional. Video width
     */
    @JsonProperty("mpeg4_width")
    private Integer width;

    /**
     * Optional. Video height
     */
    @JsonProperty("mpeg4_height")
    private Integer height;

    /**
     * Optional. Video duration in seconds
     */
    @JsonProperty("mpeg4_duration")
    private Integer duration;

    /**
     * URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
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
     * Optional. Content of the message to be sent instead of the video animation
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
