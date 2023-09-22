package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get information about a member of a chat.
 * The method is only guaranteed to work for other users if the bot is an administrator in the chat.
 * Returns a ChatMember object on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetChatMember implements TgMethod {

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
}
