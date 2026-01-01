package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.util.UnixTimeSerializer;
import tools.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

/**
 * Use this method to ban a user in a group, a supergroup or a channel.
 * In the case of supergroups and channels, the user will not be able to return to the chat on their own using invite links, etc., unless unbanned first.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class BanChatMember implements TgMethod {

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
     * Date when the user will be unbanned; Unix time.
     * If user is banned for more than 366 days or less than 30 seconds from the current time they are considered to be banned forever.
     * Applied for supergroups and channels only.
     */
    @JsonSerialize(using = UnixTimeSerializer.class)
    @JsonProperty("until_date")
    private LocalDateTime untilDate;

    /**
     * Pass True to delete all messages from the chat for the user that is being removed.
     * If False, the user will be able to see messages in the group that were sent before the user was removed.
     * Always True for supergroups and channels.
     */
    @JsonProperty("revoke_messages")
    private Boolean revokeMessages;
}
