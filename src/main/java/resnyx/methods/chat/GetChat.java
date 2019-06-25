package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.Chat;

/**
 * Use this method to get up to date information about the chat
 * (current name of the user for one-on-one conversations, current username
 * of a user, group or channel, etc.). Returns a Chat object on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetChat extends TgMethod<Chat> {

    public static final String METHOD = "getChat";

    /**
     * Unique identifier for the target chat or username of
     * the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    public GetChat(String token, Long chatId) {
        super(token);
        this.chatId = chatId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.CHAT;
    }
}
