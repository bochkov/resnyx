package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the type of a reaction. Currently, it can be one of
 * {@link ReactionTypeEmoji}
 * {@link ReactionTypeCustomEmoji}
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "emoji", value = ReactionTypeEmoji.class),
        @JsonSubTypes.Type(name = "custom_emoji", value = ReactionTypeCustomEmoji.class),
})
public interface ReactionType {
}
