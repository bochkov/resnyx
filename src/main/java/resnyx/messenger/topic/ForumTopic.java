package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;

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

    /**
     * Optional. True, if the name of the topic wasn't specified explicitly by its creator
     * and likely needs to be changed by the bot
     */
    @JsonProperty("is_name_implicit")
    private Boolean isNameImplicit;
}
