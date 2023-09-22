package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to reopen a closed topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights,
 * unless it is the creator of the topic. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ReopenForumTopic implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread of the forum topic
     */
    @JsonProperty("message_thread_id")
    private final Long messageThreadId;

}
