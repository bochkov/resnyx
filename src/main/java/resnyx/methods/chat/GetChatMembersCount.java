package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to get the number of members in a chat. Returns Int on success.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public final class GetChatMembersCount extends TgMethod<Integer> {

    public static final String METHOD = "getChatMembersCount";

    /**
     * Unique identifier for the target chat or username
     * of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.INT;
    }
}
