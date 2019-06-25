package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to unpin a message in a group, a supergroup, or a channel.
 * The bot must be an administrator in the chat for this to work and must
 * have the ‘can_pin_messages’ admin right in the supergroup or
 * ‘can_edit_messages’ admin right in the channel. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class UnpinChatMessage extends TgMethod<Boolean> {

    public static final String METHOD = "unpinChatMessage";

    /**
     * Unique identifier for the target chat or username
     * of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    public UnpinChatMessage(String token, Long chatId) {
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
