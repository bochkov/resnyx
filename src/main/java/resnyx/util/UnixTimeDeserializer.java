package resnyx.util;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.core.JsonToken;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public final class UnixTimeDeserializer extends ValueDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext ctx) throws JacksonException {
        long value = parser.currentToken().equals(JsonToken.VALUE_STRING) ?
                Long.parseLong(parser.getValueAsString()) :
                parser.getLongValue();
        return LocalDateTime.ofInstant(
                Instant.ofEpochSecond(value),
                TimeZone.getDefault().toZoneId()
        );
    }
}
