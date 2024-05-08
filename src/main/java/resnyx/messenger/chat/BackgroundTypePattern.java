package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Document;

/**
 * The background is a PNG or TGV (gzipped subset of SVG with MIME type “application/x-tgwallpattern”)
 * pattern to be combined with the background fill chosen by the user.
 */
@Data
@NoArgsConstructor
public final class BackgroundTypePattern implements BackgroundType {

    /**
     * Type of the background, always “pattern”
     */
    private String type;

    /**
     * Document with the pattern
     */
    private Document document;

    /**
     * The background fill that is combined with the pattern
     */
    private BackgroundFill fill;

    /**
     * Intensity of the pattern when it is shown above the filled background; 0-100
     */
    private Integer intensity;

    /**
     * Optional. True, if the background fill must be applied only to the pattern itself.
     * All other pixels are black in this case. For dark themes only
     */
    @JsonProperty("is_inverted")
    private Boolean isInverted;

    /**
     * Optional. True, if the background moves slightly when the device is tilted
     */
    @JsonProperty("is_moving")
    private Boolean isMoving;
}
