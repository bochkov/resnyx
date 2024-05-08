package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the way a background is filled based on the selected colors. Currently, it can be one of
 * BackgroundFillSolid
 * BackgroundFillGradient
 * BackgroundFillFreeformGradient
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "solid", value = BackgroundFillSolid.class),
        @JsonSubTypes.Type(name = "gradient", value = BackgroundFillGradient.class),
        @JsonSubTypes.Type(name = "freeform_gradient", value = BackgroundFillFreeformGradient.class)
})
public interface BackgroundFill {
}
