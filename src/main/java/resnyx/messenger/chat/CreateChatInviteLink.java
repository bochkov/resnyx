package resnyx.messenger.chat;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.util.UnixTimeSerializer;

/**
 * Use this method to create an additional invite link for a chat.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * The link can be revoked using the method revokeChatInviteLink.
 * Returns the new invite link as ChatInviteLink object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CreateChatInviteLink implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Invite link name; 0-32 characters
     */
    private String name;

    /**
     * Point in time (Unix timestamp) when the link will expire
     */
    @JsonSerialize(using = UnixTimeSerializer.class)
    @JsonProperty("expire_date")
    private LocalDateTime expireDate;

    /**
     * The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
     */
    @JsonProperty("member_limit")
    private Integer memberLimit;

    /**
     * True, if users joining the chat via the link need to be approved by chat administrators.
     * If True, member_limit can't be specified
     */
    @JsonProperty("creates_join_request")
    private Boolean createsJoinRequest;
}
