package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

/**
 * This object describes the background of a gift.
 */
@Data
@NoArgsConstructor
public final class GiftBackground {

    /**
     * Center color of the background in RGB format
     */
    @JsonProperty("center_color")
    private Color centerColor;

    /**
     * Edge color of the background in RGB format
     */
    @JsonProperty("edge_color")
    private Color edgeColor;

    /**
     * Text color of the background in RGB format
     */
    @JsonProperty("text_color")
    private Color textColor;
}
