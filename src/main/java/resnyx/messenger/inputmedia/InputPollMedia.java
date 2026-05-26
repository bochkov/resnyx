package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents the content of a poll description or a quiz explanation to be sent. It should be one of
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputMediaAnimation.class, name = "animation"),
        @JsonSubTypes.Type(value = InputMediaAudio.class, name = "audio"),
        @JsonSubTypes.Type(value = InputMediaDocument.class, name = "document"),
        @JsonSubTypes.Type(value = InputMediaLivePhoto.class, name = "live_photo"),
        @JsonSubTypes.Type(value = InputMediaLocation.class, name = "location"),
        @JsonSubTypes.Type(value = InputMediaPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = InputMediaVenue.class, name = "venue"),
        @JsonSubTypes.Type(value = InputMediaVideo.class, name = "video"),
})
public interface InputPollMedia {
}
