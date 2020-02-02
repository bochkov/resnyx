package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to send audio files, if you want Telegram clients to display the
 * file as a playable voice message. For this to work, your audio must be in an .ogg
 * file encoded with OPUS (other formats may be sent as Audio or Document).
 * On success, the sent Message is returned. Bots can currently send voice
 * messages of up to 50 MB in size, this limit may be changed in the future.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendVoice extends ReplyMethod<Message> {

    public static final String METHOD = "sendVoice";

    /**
     * Unique identifier for the target chat or username of the target channel
     * (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Audio file to send. Pass a file_id as String to send a file that exists on the
     * Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a
     * file from the Internet, or upload a new one using multipart/form-data
     */
    private String voice;

    /**
     * Optional. Voice message caption, 0-1024 characters
     */
    private String caption;

    /**
     * Optional. Duration of the voice message in seconds
     */
    private Integer duration;

    public SendVoice(String token, Long chatId, String voice) {
        super(token);
        this.chatId = chatId;
        this.voice = voice;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<Message>> type() {
        return Types.MESSAGE;
    }
}
