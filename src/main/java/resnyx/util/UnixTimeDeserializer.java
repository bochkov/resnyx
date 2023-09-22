package resnyx.util;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public final class UnixTimeDeserializer extends JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        long value = parser.getLongValue();
        return LocalDateTime.ofInstant(
                Instant.ofEpochSecond(value),
                TimeZone.getDefault().toZoneId()
        );
    }
}
