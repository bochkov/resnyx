package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about an edited forum topic.
 */
@Data
@NoArgsConstructor
public final class ForumTopicEdited {

    /**
     * Optional. New name of the topic, if it was edited
     */
    private String name;

    /**
     * Optional. New identifier of the custom emoji shown as the topic icon, if it was edited; an empty string if the icon was removed
     */
    @JsonProperty("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}
