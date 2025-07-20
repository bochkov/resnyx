package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit a checklist on behalf of a connected business account.
 * On success, the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageChecklist implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier for the target chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Unique identifier for the target message
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * A JSON-serialized object for the checklist to send
     */
    private final InputChecklist checklist;

    /**
     * A JSON-serialized object for an inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
}
