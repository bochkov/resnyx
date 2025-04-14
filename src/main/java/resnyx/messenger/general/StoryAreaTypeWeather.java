package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.ColorRGBDeserializer;

import java.awt.*;

/**
 * Describes a story area containing weather information. Currently, a story can have up to 3 weather areas.
 */
@Data
@NoArgsConstructor
public final class StoryAreaTypeWeather implements StoryAreaType {

    /**
     * Type of the area, always “weather”
     */
    private String type;

    /**
     * Temperature, in degree Celsius
     */
    private Double temperature;

    /**
     * Emoji representing the weather
     */
    private String emoji;

    /**
     * A color of the area background in the ARGB format
     */
    @JsonProperty("background_color")
    @JsonDeserialize(using = ColorRGBDeserializer.class)
    private Color backgroundColor;
}
