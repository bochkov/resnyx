package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method for your bot to leave a group, supergroup or channel. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class LeaveChat extends TgMethod<Boolean> {

    public static final String METHOD = "leaveChat";

    /**
     * Unique identifier for the target chat or username
     * of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    public LeaveChat(String token, Long chatId) {
        super(token);
        this.chatId = chatId;
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
