package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the bot's menu button in a private chat, or the default menu button.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetChatMenuButton implements TgMethod {

    /**
     * Unique identifier for the target private chat.
     * If not specified, default bot's menu button will be changed
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * A JSON-serialized object for the bot's new menu button. Defaults to MenuButtonDefault
     */
    @JsonProperty("menu_button")
    private MenuButton menuButton;

}
