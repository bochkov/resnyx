package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;

import java.awt.*;

/**
 * This object describes the colors of the backdrop of a unique gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftBackdropColors {

    /**
     * The color in the center of the backdrop in RGB format
     */
    @JsonProperty("center_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color centerColor;

    /**
     * The color on the edges of the backdrop in RGB format
     */
    @JsonProperty("edge_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color egdeColor;

    /**
     * The color to be applied to the symbol in RGB format
     */
    @JsonProperty("symbol_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color symbolColor;

    /**
     * The color for the text on the backdrop in RGB format
     */
    @JsonProperty("text_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color textColor;
}
