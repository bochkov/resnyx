package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to remove a reaction from a message in a group or a supergroup chat.
 * The bot must have the 'can_delete_messages' administrator right in the chat.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteMessageReaction implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup in the format @username
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the target message
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * Identifier of the user whose reaction will be removed, if the reaction was added by a user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Identifier of the chat whose reaction will be removed, if the reaction was added by a chat
     */
    @JsonProperty("actor_chat_id")
    private Long actorChatId;
}
