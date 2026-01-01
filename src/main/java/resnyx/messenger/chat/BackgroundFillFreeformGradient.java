package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;
import java.util.List;

/**
 * The background is a freeform gradient that rotates after every message in the chat.
 */
@Data
@NoArgsConstructor
public final class BackgroundFillFreeformGradient implements BackgroundFill {

    /**
     * Type of the background fill, always “freeform_gradient”
     */
    private String type;

    /**
     * A list of the 3 or 4 base colors that are used to generate the freeform gradient in the RGB24 format
     */
    @JsonDeserialize(contentAs = ColorRGBDeserializer.class)
    private List<Color> colors;
}
