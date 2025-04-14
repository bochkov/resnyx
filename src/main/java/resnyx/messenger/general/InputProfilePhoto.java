package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes a profile photo to set. Currently, it can be one of
 * <ul>
 *     <li>{@link InputProfilePhotoStatic}</li>
 *     <li>{@link InputProfilePhotoAnimated}</li>
 * </ul>
 * <p>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = InputProfilePhotoStatic.class, name = "static"),
        @JsonSubTypes.Type(value = InputProfilePhotoAnimated.class, name = "animated"),
})
public interface InputProfilePhoto {
}
