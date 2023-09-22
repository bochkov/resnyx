package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.TgMethodName;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit only the reply markup of messages.
 * On success True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
@TgMethodName("editMessageReplyMarkup")
public final class EditInlineMessageReplyMarkup implements TgMethod {

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
