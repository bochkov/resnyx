package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;

/**
 * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
 * For this to work, your audio must be in an .OGG file encoded with OPUS (other formats may be sent as Audio or Document).
 * On success, the sent Message is returned.
 * Bots can currently send voice messages of up to 50 MB in size, this limit may be changed in the future.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendVoice implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Audio file to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data.
     */
    private final InputFile voice;

    @JsonUnwrapped
    private Caption caption;

    /**
     * Duration of the voice message in seconds
     */
    private Integer duration;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
