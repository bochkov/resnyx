package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to edit name and icon of a topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have can_manage_topics administrator rights,
 * unless it is the creator of the topic. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditForumTopic implements TgMethod {

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

    /**
     * New topic name, 0-128 characters. If not specified or empty, the current name of the topic will be kept
     */
    private String name;

    /**
     * New unique identifier of the custom emoji shown as the topic icon.
     * Use getForumTopicIconStickers to get all allowed custom emoji identifiers.
     * Pass an empty string to remove the icon.
     * If not specified, the current icon will be kept
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}
