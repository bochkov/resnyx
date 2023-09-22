package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to clear the list of pinned messages in a General forum topic.
 * The bot must be an administrator in the chat for this to work and must have the can_pin_messages administrator right in the supergroup.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class UnpinAllGeneralForumTopicMessages implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;
}
