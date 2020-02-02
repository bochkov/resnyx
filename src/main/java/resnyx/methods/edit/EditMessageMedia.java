package resnyx.methods.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InlineKeyboardMarkup;
import resnyx.model.InputMedia;
import resnyx.model.Message;

/**
 * Use this method to edit animation, audio, document, photo, or video messages.
 * If a message is a part of a message album, then it can be edited only to a photo or a video.
 * Otherwise, message type can be changed arbitrarily. When inline message is edited,
 * new file can't be uploaded. Use previously uploaded file via its file_id or specify a URL.
 * On success, if the edited message was sent by the bot, the edited Message is returned,
 * otherwise True is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EditMessageMedia extends TgMethod<Message> {

    public static final String METHOD = "editMessageMedia";

    /**
     * Required if inline_message_id is not specified.
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Required if inline_message_id is not specified.
     * Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Required if chat_id and message_id are not specified.
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineId;

    /**
     * A JSON-serialized object for a new media content of the message
     */
    private InputMedia media;

    /**
     * A JSON-serialized object for a new inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public EditMessageMedia(String token, Long chatId, Long messageId, InputMedia media) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
        this.media = media;
    }

    public EditMessageMedia(String token, String inlineId, InputMedia media) {
        super(token);
        this.inlineId = inlineId;
        this.media = media;
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
