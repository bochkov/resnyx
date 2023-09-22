package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 Use this method to hide the 'General' topic in a forum supergroup chat.
 The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
 The topic will be automatically closed if it was open.
 Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class HideGeneralForumTopic implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;
}
