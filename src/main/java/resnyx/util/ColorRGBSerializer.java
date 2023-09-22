package resnyx.util;

import java.awt.*;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class ColorRGBSerializer extends JsonSerializer<Color> {
    @Override
    public void serialize(Color value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        int sValue = (value.getRed() << 16) | (value.getGreen() << 8) | value.getBlue();
        gen.writeNumber(sValue);
    }
}
