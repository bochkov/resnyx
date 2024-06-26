package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit only the reply markup of messages.
 * On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageReplyMarkup implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message to be edited was sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private final String inlineMessageId;

    /**
     * A JSON-serialized object for an inline keyboard.
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
