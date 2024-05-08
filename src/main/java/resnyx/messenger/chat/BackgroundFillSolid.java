package resnyx.messenger.chat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;

import java.awt.*;

/**
 * The background is filled using the selected color.
 */
@Data
@NoArgsConstructor
public final class BackgroundFillSolid implements BackgroundFill {

    /**
     * Type of the background fill, always “solid”
     */
    private String type;

    /**
     * The color of the background fill in the RGB24 format
     */
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color color;

}
