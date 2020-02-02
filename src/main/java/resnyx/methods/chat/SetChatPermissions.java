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
 * Use this method to set default chat permissions for all members.
 * The bot must be an administrator in the group or a supergroup for this to work
 * and must have the can_restrict_members admin rights. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SetChatPermissions extends TgMethod<Boolean> {

    public static final String METHOD = "setChatPermissions";

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * New default chat permissions
     */
    private ChatPermissions permissions;

    public SetChatPermissions(String token, Long chatId, ChatPermissions permissions) {
        super(token);
        this.chatId = chatId;
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

