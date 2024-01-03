package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "channel", value = MessageOriginChannel.class),
        @JsonSubTypes.Type(name = "chat", value = MessageOriginChat.class),
        @JsonSubTypes.Type(name = "hidden_user", value = MessageOriginHiddenUser.class),
        @JsonSubTypes.Type(name = "user", value = MessageOriginUser.class),
})
public interface MessageOrigin {
}
