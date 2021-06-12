package resnyx.methods.chat;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.ChatMember;

/**
 * Use this method to get a list of administrators in a chat.
 * On success, returns an Array of ChatMember objects that contains
 * information about all chat administrators except other bots.
 * If the chat is a group or a supergroup and no administrators were appointed,
 * only the creator will be returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetChatAdmins extends TgMethod<List<ChatMember>> {

    public static final String METHOD = "getChatAdministrators";

    /**
     * Unique identifier for the target chat or username of the target
     * supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    public GetChatAdmins(String token, Long chatId) {
        super(token);
        this.chatId = chatId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<List<ChatMember>>> type() {
        return Types.CHAT_MEMBERS;
    }
}
