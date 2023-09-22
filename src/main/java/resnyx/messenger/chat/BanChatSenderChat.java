package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to ban a channel chat in a supergroup or a channel.
 * Until the chat is unbanned, the owner of the banned chat won't be able to send messages on behalf of any of their channels.
 * The bot must be an administrator in the supergroup or channel for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class BanChatSenderChat implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier of the target sender chat
     */
    @JsonProperty("sender_chat_id")
    private final Long senderChatId;
}
