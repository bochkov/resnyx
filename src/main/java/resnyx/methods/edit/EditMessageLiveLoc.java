package resnyx.methods.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InlineKeyboardMarkup;
import resnyx.model.Message;

/**
 * Use this method to edit live location messages.
 * A location can be edited until its live_period expires or editing is explicitly
 * disabled by a call to stopMessageLiveLocation.
 * On success, if the edited message was sent by the bot,
 * the edited Message is returned, otherwise True is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class EditMessageLiveLoc extends TgMethod<Message> {

    public static final String METHOD = "editMessageLiveLocation";

    /**
     * Required if inline_message_id is not specified.
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Required if inline_message_id is not specified. Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private String inlineId;

    /**
     * Latitude of new location
     */
    private Float latitude;

    /**
     * Longitude of new location
     */
    private Float longitude;

    /**
     * Optional. A JSON-serialized object for a new inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public EditMessageLiveLoc(String token, Long chatId, Long messageId,
                              Float latitude, Float longitude) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public EditMessageLiveLoc(String token, String inlineId, Float latitude, Float longitude) {
        super(token);
        this.inlineId = inlineId;
        this.latitude = latitude;
        this.longitude = longitude;
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
