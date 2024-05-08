package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Document;

/**
 * The background is a wallpaper in the JPEG format.
 */
@Data
@NoArgsConstructor
public final class BackgroundTypeWallpaper implements BackgroundType {

    /**
     * Type of the background, always “wallpaper”
     */
    private String type;

    /**
     * Document with the wallpaper
     */
    private Document document;

    /**
     * Dimming of the background in dark themes, as a percentage; 0-100
     */
    @JsonProperty("dark_theme_dimming")
    private Integer darkThemeDimming;

    /**
     * Optional. True, if the wallpaper is downscaled to fit in a 450x450 square and then box-blurred with radius 12
     */
    @JsonProperty("is_blurred")
    private Boolean isBlurred;

    /**
     * Optional. True, if the background moves slightly when the device is tilted
     */
    @JsonProperty("is_moving")
    private Boolean isMoving;
}
