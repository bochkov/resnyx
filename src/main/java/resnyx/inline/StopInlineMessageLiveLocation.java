package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.TgMethodName;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to stop updating a live location message before live_period expires.
 * On success True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
@TgMethodName("stopMessageLiveLocation")
public final class StopInlineMessageLiveLocation implements TgMethod {

    /**
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private final String inlineMessageId;

    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
