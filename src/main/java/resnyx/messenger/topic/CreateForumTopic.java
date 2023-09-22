package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to create a topic in a forum supergroup chat.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_topics administrator rights.
 * Returns information about the created topic as a ForumTopic object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CreateForumTopic implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Topic name, 1-128 characters
     */
    private final String name;

    /**
     * Color of the topic icon in RGB format.
     */
    @JsonProperty("icon_color")
    private TopicColor iconColor;

    /**
     * Unique identifier of the custom emoji shown as the topic icon.
     * Use getForumTopicIconStickers to get all allowed custom emoji identifiers.
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}
