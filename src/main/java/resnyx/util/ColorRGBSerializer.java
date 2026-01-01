package resnyx.util;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

import java.awt.*;

public final class ColorRGBSerializer extends ValueSerializer<Color> {
    @Override
    public void serialize(Color value, JsonGenerator gen, SerializationContext ctx) throws JacksonException {
        int sValue = (value.getRed() << 16) | (value.getGreen() << 8) | value.getBlue();
        gen.writeNumber(sValue);
    }
}
