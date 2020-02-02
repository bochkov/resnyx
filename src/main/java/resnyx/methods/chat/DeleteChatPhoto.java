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
 * Use this method to delete a chat photo. Photos can't be changed for private chats.
 * The bot must be an administrator in the chat for this to work and must have the
 * appropriate admin rights. Returns True on success.
 * <p>
 * Note: In regular groups (non-supergroups), this method will only work if the
 * ‘All Members Are Admins’ setting is off in the target group.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class DeleteChatPhoto extends TgMethod<Boolean> {

    public static final String METHOD = "deleteChatPhoto";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    public DeleteChatPhoto(String token, Long chatId) {
        super(token);
        this.chatId = chatId;
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
