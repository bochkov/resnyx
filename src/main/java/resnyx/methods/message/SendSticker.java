package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.InputFile;
import resnyx.model.Message;

/**
 * Use this method to send .webp stickers. On success, the sent Message is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendSticker extends ReplyMethod<Message> {

    public static final String METHOD = "sendSticker";

    /**
     * Unique identifier for the target chat or username of
     * the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Sticker to send. Pass a file_id as String to send a file that exists on
     * the Telegram servers (recommended), pass an HTTP URL as a String for Telegram
     * to get a .webp file from the Internet, or upload a new one using multipart/form-data.
     */
    @JsonProperty("sticker")
    private InputFile sticker;

    public SendSticker(String token, Long chatId, InputFile sticker) {
        super(token);
        this.chatId = chatId;
        this.sticker = sticker;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.MESSAGE;
    }
}
