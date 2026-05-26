package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes paid media. Currently, it can be one of
 * <ul>
 * <li>{@link PaidMediaLivePhoto}</li>
 * <li>{@link PaidMediaPreview}</li>
 * <li>{@link PaidMediaPhoto}</li>
 * <li>{@link PaidMediaVideo}</li>
 * </ul>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PaidMediaLivePhoto.class, name = "live_photo"),
        @JsonSubTypes.Type(value = PaidMediaPhoto.class, name = "photo"),
        @JsonSubTypes.Type(value = PaidMediaPreview.class, name = "preview"),
        @JsonSubTypes.Type(value = PaidMediaVideo.class, name = "video"),
})
public interface PaidMedia {
}
