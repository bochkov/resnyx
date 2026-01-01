package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.awt.*;
import java.util.List;

/**
 * This object contains information about the color scheme for a user's name,
 * message replies and link previews based on a unique gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGiftColors {

    /**
     * Custom emoji identifier of the unique gift's model
     */
    @JsonProperty("model_custom_emoji_id")
    private String modelCustomEmojiId;

    /**
     * Custom emoji identifier of the unique gift's symbol
     */
    @JsonProperty("symbol_custom_emoji_id")
    private String symbolCustomEmojiId;

    /**
     * Main color used in light themes; RGB format
     */
    @JsonProperty("light_theme_main_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color lightThemeMainColor;

    /**
     * List of 1-3 additional colors used in light themes; RGB format
     */
    @JsonProperty("light_theme_other_colors")
    @JsonDeserialize(contentUsing = ColorRGBDeserializer.class)
    private List<Color> lightThemeOtherColors;

    /**
     * Main color used in dark themes; RGB format
     */
    @JsonProperty("dark_theme_main_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color darkThemeMainColor;

    /**
     * List of 1-3 additional colors used in dark themes; RGB format
     */
    @JsonProperty("dark_theme_other_colors")
    @JsonDeserialize(contentUsing = ColorRGBDeserializer.class)
    private List<Color> darkThemeOtherColors;

}
