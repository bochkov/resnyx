package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to change the title of a chat.
 * Titles can't be changed for private chats.
 * The bot must be an administrator in the chat for this to work and must have the
 * appropriate admin rights. Returns True on success.
 * <p>
 * Note: In regular groups (non-supergroups), this method will only
 * work if the ‘All Members Are Admins’ setting is off in the target group.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SetChatTitle extends TgMethod<Boolean> {

    public static final String METHOD = "setChatTitle";

    /**
     * Unique identifier for the target chat or username
     * of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * New chat title, 1-255 characters
     */
    private String title;

    public SetChatTitle(String token, Long chatId, String title) {
        super(token);
        this.chatId = chatId;
        this.title = title;
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
