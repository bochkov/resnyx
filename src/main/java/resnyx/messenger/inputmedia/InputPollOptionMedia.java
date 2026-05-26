package resnyx.messenger.inputmedia;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object represents the content of a poll option to be sent. It should be one of
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputMediaAnimation.class, name = "animation"),
        @JsonSubTypes.Type(value = InputMediaLivePhoto.class, name = "live_photo"),
        @JsonSubTypes.Type(value = InputMediaLocation.class, name = "location"),
        @JsonSubTypes.Type(value = InputMediaPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = InputMediaSticker.class, name = "sticker"),
        @JsonSubTypes.Type(value = InputMediaVenue.class, name = "venue"),
        @JsonSubTypes.Type(value = InputMediaVideo.class, name = "video"),
})
public interface InputPollOptionMedia {
}
