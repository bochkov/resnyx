package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.ChatPermissions;

/**
 * Use this method to restrict a user in a supergroup.
 * The bot must be an administrator in the supergroup for this to work and must have
 * the appropriate admin rights. Pass True for all permissions to lift
 * restrictions from a user. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class RestrictChatMember extends TgMethod<Boolean> {

    public static final String METHOD = "restrictChatMember";

    /**
     * Unique identifier for the target chat or username of the
     * target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    /**
     * New user permissions
     */
    private ChatPermissions permissions;

    /**
     * Optional. Date when restrictions will be lifted for the user, unix time.
     * If user is restricted for more than 366 days or less than 30 seconds
     * from the current time, they are considered to be restricted forever
     */
    @JsonProperty("until_date")
    private Integer until;

    public RestrictChatMember(String token, Long chatId, Long userId, ChatPermissions permissions) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
        this.permissions = permissions;
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
