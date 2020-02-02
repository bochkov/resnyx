package resnyx.methods.chat;

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
 * Use this method to get information about a member of a chat. Returns a ChatMember object on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetChatMember extends TgMethod<ChatMember> {

    public static final String METHOD = "getChatMember";

    /**
     * Unique identifier for the target chat or username of
     * the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private Long userId;

    public GetChatMember(String token, Long chatId, Long userId) {
        super(token);
        this.chatId = chatId;
        this.userId = userId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<ChatMember>> type() {
        return Types.CHAT_MEMBER;
    }
}
