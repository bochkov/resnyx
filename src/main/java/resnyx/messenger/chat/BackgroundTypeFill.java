package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The background is automatically filled based on the selected colors.
 */
@Data
@NoArgsConstructor
public final class BackgroundTypeFill implements BackgroundType {

    /**
     * Type of the background, always “fill”
     */
    private String type;

    /**
     * The background fill
     */
    private BackgroundFill fill;

    /**
     * Dimming of the background in dark themes, as a percentage; 0-100
     */
    @JsonProperty("dark_theme_dimming")
    private Integer darkThemeDimming;
}
