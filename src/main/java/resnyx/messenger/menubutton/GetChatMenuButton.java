package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get the current value of the bot's menu button in a private chat,
 * or the default menu button. Returns MenuButton on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetChatMenuButton implements TgMethod {

    /**
     * Unique identifier for the target private chat.
     * If not specified, default bot's menu button will be returned
     */
    @JsonProperty("chat_id")
    private Long chatId;

}
