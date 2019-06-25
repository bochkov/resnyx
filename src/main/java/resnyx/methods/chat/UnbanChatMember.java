package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to unban a previously kicked user in a supergroup or channel.
 * The user will not return to the group or channel automatically,
 * but will be able to join via link, etc. The bot must be an administrator for this to work.
 * Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class UnbanChatMember extends TgMethod<Boolean> {

    public static final String METHOD = "unbanChatMember";

    /**
     * Unique identifier for the target group or username
     * of the target supergroup or channel (in the format @username)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    public UnbanChatMember(String token, Long chatId, Long userId) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.BOOL;
    }
}
