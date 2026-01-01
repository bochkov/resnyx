package resnyx.util;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueSerializer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public final class UnixTimeSerializer extends ValueSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializationContext ctx) throws JacksonException {
        Instant instant = value.atZone(TimeZone.getDefault().toZoneId()).toInstant();
        gen.writeNumber(instant.getEpochSecond());
    }
}
