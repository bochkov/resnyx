package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get up to date information about the chat
 * (current name of the user for one-on-one conversations, current username of a user, group or channel, etc.).
 * Returns a Chat object on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetChat implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

}
