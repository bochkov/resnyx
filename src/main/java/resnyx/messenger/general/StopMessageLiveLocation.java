package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 Use this method to stop updating a live location message before live_period expires.
 On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class StopMessageLiveLocation implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private final Long messageId;

    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
