package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete a chat photo. Photos can't be changed for private chats.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteChatPhoto implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;
}
