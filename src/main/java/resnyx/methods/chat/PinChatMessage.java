package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to pin a message in a group, a supergroup, or a channel.
 * The bot must be an administrator in the chat for this to work and must have
 * the ‘can_pin_messages’ admin right in the supergroup or ‘can_edit_messages’
 * admin right in the channel. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class PinChatMessage extends TgMethod<Boolean> {

    public static final String METHOD = "pinChatMessage";

    /**
     * Unique identifier for the target chat or username of
     * the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Identifier of a message to pin
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Optional. Pass True, if it is not necessary to send a notification to all
     * chat members about the new pinned message. Notifications are always disabled in channels.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    public PinChatMessage(String token, Long chatId, Long messageId) {
        super(token);
        this.chatId = chatId;
        this.messageId = messageId;
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

