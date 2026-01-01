package resnyx.util;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

import java.awt.*;

public final class ColorRGBDeserializer extends ValueDeserializer<Color> {
    @Override
    public Color deserialize(JsonParser parser, DeserializationContext context) throws JacksonException {
        int ll = parser.getIntValue();
        int red = (ll & 0x00FF0000) >> 16;
        int green = (ll & 0x0000FF00) >> 8;
        int blue = ll & 0x000000FF;
        return new Color(red, green, blue);
    }
}
