package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound) stored on the Telegram servers.
 * By default, this animated MPEG-4 file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the animation.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedMpeg4Gif implements InlineQueryResult {

    /**
     * Type of the result, must be mpeg4_gif
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid file identifier for the MPEG4 file
     */
    @JsonProperty("mpeg4_file_id")
    private String fileId;

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
