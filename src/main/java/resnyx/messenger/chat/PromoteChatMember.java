package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to promote or demote a user in a supergroup or a channel.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Pass False for all boolean parameters to demote a user. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class PromoteChatMember implements TgMethod {

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

    @JsonUnwrapped
    private ChatAdministratorRights rights;
}
