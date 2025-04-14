package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputStoryContentPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = InputStoryContentVideo.class, name = "video"),
})
public interface InputStoryContent {
}
