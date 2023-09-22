package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to approve a chat join request.
 * The bot must be an administrator in the chat for this to work and must have the can_invite_users administrator right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ApproveChatJoinRequest implements TgMethod {

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
