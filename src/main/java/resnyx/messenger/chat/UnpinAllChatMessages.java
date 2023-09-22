package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to clear the list of pinned messages in a chat.
 * If the chat is not a private chat, the bot must be an administrator in the chat for this to work and must have
 * the 'can_pin_messages' administrator right in a supergroup or 'can_edit_messages' administrator right in a channel.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class UnpinAllChatMessages implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;
}
