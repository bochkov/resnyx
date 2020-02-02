package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to kick a user from a group, a supergroup or a channel.
 * In the case of supergroups and channels, the user will not be able to return to the group on
 * their own using invite links, etc., unless unbanned first. The bot must be an administrator
 * in the chat for this to work and must have the appropriate admin rights.
 * Returns True on success.
 * <p>
 * Note: In regular groups (non-supergroups), this method will only work if the
 * ‘All Members Are Admins’ setting is off in the target group. Otherwise members may only be
 * removed by the group's creator or by the member that added them.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class KickChatMember extends TgMethod<Boolean> {

    public static final String METHOD = "kickChatMember";

    /**
     * Unique identifier for the target group or username of the target
     * supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * Optional. Date when the user will be unbanned, unix time.
     * If user is banned for more than 366 days or less than 30 seconds
     * from the current time they are considered to be banned forever
     */
    private Integer until;

    public KickChatMember(String token, Long chatId, Long userId) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<Boolean>> type() {
        return Types.BOOL;
    }
}
