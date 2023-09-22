package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set a custom title for an administrator in a supergroup promoted by the bot.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetChatAdministratorCustomTitle implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * New custom title for the administrator; 0-16 characters, emoji are not allowed
     */
    @JsonProperty("custom_title")
    private final String customTitle;
}
