package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers.
 * By default, this animated GIF file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to send a message with specified content instead of the animation.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedGif implements InlineQueryResult {

    /**
     * Type of the result, must be gif
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     *A valid file identifier for the GIF file
     */
    @JsonProperty("gif_file_id")
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
     * Optional. Content of the message to be sent instead of the GIF animation
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
