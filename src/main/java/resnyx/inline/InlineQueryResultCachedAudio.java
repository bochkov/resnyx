package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Caption;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a link to an MP3 audio file stored on the Telegram servers.
 * By default, this audio file will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the audio.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultCachedAudio implements InlineQueryResult {

    /**
     * Type of the result, must be audio
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * A valid file identifier for the audio file
     */
    @JsonProperty("audio_file_id")
    private String fileId;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the audio
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;
}
