package resnyx.messenger.topic;

import java.awt.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;

/**
 * This object represents a service message about a new forum topic created in the chat.
 */
@Data
@NoArgsConstructor
public final class ForumTopicCreated {

    /**
     * Name of the topic
     */
    private String name;

    /**
     * Color of the topic icon in RGB format
     */
    @JsonProperty("icon_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color iconColor;

    /**
     * Optional. Unique identifier of the custom emoji shown as the topic icon
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}
