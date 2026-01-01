package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;

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

    /**
     * Optional. True, if the name of the topic wasn't specified explicitly by its creator
     * and likely needs to be changed by the bot
     */
    @JsonProperty("is_name_implicit")
    private Boolean isNameImplicit;
}
