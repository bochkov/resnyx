package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents the content of a media message to be sent.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputMediaPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = InputMediaVideo.class, name = "video"),
        @JsonSubTypes.Type(value = InputMediaAnimation.class, name = "animation"),
        @JsonSubTypes.Type(value = InputMediaAudio.class, name = "audio"),
        @JsonSubTypes.Type(value = InputMediaDocument.class, name = "document")
})
public interface InputMedia {
}
