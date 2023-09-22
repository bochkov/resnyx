package resnyx.util;

import java.awt.*;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public final class ColorRGBDeserializer extends JsonDeserializer<Color> {
    @Override
    public Color deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        int ll = parser.getIntValue();
        int red = (ll & 0x00FF0000) >> 16;
        int green = (ll & 0x0000FF00) >> 8;
        int blue = ll & 0x000000FF;
        return new Color(red, green, blue);
    }
}
