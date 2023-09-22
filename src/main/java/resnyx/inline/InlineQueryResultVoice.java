package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to a voice recording in an .OGG container encoded with OPUS.
 * By default, this voice recording will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the the voice message.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultVoice implements InlineQueryResult {

    /**
     * Type of the result, must be voice
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid URL for the voice recording
     */
    @JsonProperty("voice_url")
    private String url;

    /**
     * Recording title
     */
    private String title;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Recording duration in seconds
     */
    @JsonProperty("voice_duration")
    private Integer duration;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the voice recording
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
