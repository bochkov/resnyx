package resnyx.messenger.topic;

import java.awt.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;

/**
 * This object represents a forum topic.
 */
@Data
@NoArgsConstructor
public final class ForumTopic {

    /**
     * Unique identifier of the forum topic
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Name of the topic
     */
    private String name;

    /**
     * Color of the topic icon in RGB format
     */
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    @JsonProperty("icon_color")
    private Color iconColor;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}
