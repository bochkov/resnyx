package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get a list of administrators in a chat, which aren't bots. Returns an Array of ChatMember objects.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetChatAdministrators implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Pass True to additionally receive all bots that are administrators of the chat.
     * By default, bots other than the current bot are omitted.
     */
    @JsonProperty("return_bots")
    private Boolean returnBots;
}
