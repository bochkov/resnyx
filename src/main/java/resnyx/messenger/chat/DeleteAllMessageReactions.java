package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to remove up to 10000 recent reactions in a group or a supergroup chat added by a given user or chat.
 * The bot must have the 'can_delete_messages' administrator right in the chat.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteAllMessageReactions implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup in the format @username
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the user whose reactions will be removed, if the reactions were added by a user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Identifier of the chat whose reactions will be removed, if the reactions were added by a chat
     */
    @JsonProperty("actor_chat_id")
    private Long actorChatId;
}
