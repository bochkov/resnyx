package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes a message that can be inaccessible to the bot. It can be one of
 * {@link Message}
 * {@link InaccessibleMessage}
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "date", visible = true, defaultImpl = Message.class)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "0", value = InaccessibleMessage.class),
})
public interface MaybeInaccessibleMessage {
}
