package resnyx.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public final class UnixTimeDeserializer extends JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        long value = parser.currentToken().equals(JsonToken.VALUE_STRING) ?
                Long.parseLong(parser.getValueAsString()) :
                parser.getLongValue();
        return LocalDateTime.ofInstant(
                Instant.ofEpochSecond(value),
                TimeZone.getDefault().toZoneId()
        );
    }
}
