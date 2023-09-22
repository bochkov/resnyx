package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to unban a previously banned user in a supergroup or channel.
 * The user will not return to the group or channel automatically, but will be able to join via link, etc.
 * The bot must be an administrator for this to work.
 * By default, this method guarantees that after the call the user is not a member of the chat, but will be able to join it.
 * So if the user is a member of the chat they will also be removed from the chat.
 * If you don't want this, use the parameter only_if_banned.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class UnbanChatMember implements TgMethod {

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
     * Do nothing if the user is not banned
     */
    @JsonProperty("only_if_banned")
    private Boolean onlyIfBanned;
}
