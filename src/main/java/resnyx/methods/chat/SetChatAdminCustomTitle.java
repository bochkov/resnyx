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
 * Use this method to set a custom title for an administrator in a supergroup promoted by the bot. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SetChatAdminCustomTitle extends TgMethod<Boolean> {

    public static final String METHOD = "setChatAdministratorCustomTitle";

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private String chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Integer userId;

    /**
     * New custom title for the administrator; 0-16 characters, emoji are not allowed
     */
    @JsonProperty("custom_title")
    private String customTitle;

    public SetChatAdminCustomTitle(String token, String chatId, Integer userId, String customTitle) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
        this.customTitle = customTitle;
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

