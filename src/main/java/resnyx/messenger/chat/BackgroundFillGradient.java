package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;

/**
 * The background is a gradient fill.
 */
@Data
@NoArgsConstructor
public final class BackgroundFillGradient implements BackgroundFill {

    /**
     * Type of the background fill, always “gradient”
     */
    private String type;

    /**
     * Top color of the gradient in the RGB24 format
     */
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    @JsonProperty("top_color")
    private Color topColor;

    /**
     * Bottom color of the gradient in the RGB24 format
     */
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    @JsonProperty("bottom_color")
    private Color bottomColor;

    /**
     * Clockwise rotation angle of the background fill in degrees; 0-359
     */
    @JsonProperty("rotation_angle")
    private Integer rotationAngle;
}
