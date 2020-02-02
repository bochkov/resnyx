package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.InputFile;

/**
 * Use this method to set a new profile photo for the chat. Photos can't be changed for private chats.
 * The bot must be an administrator in the chat for this to work and must have the appropriate admin rights.
 * Returns True on success.
 * <p>
 * Note: In regular groups (non-supergroups), this method will only
 * work if the ‘All Members Are Admins’ setting is off in the target group.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SetChatPhoto extends TgMethod<Boolean> {

    public static final String METHOD = "setChatPhoto";

    /**
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * New chat photo, uploaded using multipart/form-data
     */
    private InputFile photo;

    public SetChatPhoto(String token, Long chatId, InputFile photo) {
        super(token);
        this.chatId = chatId;
        this.photo = photo;
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
