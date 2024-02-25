package resnyx.util;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import resnyx.util.UnixTimeDeserializer;

@ExtendWith(MockitoExtension.class)
class UnixTimeDeserializerTest {

    @Mock
    JsonParser parser;

    @Test
    void testLong() throws IOException {
        UnixTimeDeserializer des = new UnixTimeDeserializer();
        Mockito.when(parser.currentToken()).thenReturn(JsonToken.START_OBJECT);
        Mockito.when(parser.getLongValue()).thenReturn(1694670489L);
        LocalDateTime dt = des.deserialize(parser, null);
        LocalDateTime expected = LocalDateTime.of(2023, 9, 14, 10, 48, 9);
        Assertions.assertThat(dt).isEqualTo(expected);
    }

    @Test
    void testString() throws IOException {
        UnixTimeDeserializer des = new UnixTimeDeserializer();
        Mockito.when(parser.currentToken()).thenReturn(JsonToken.VALUE_STRING);
        Mockito.when(parser.getValueAsString()).thenReturn("1694670489");
        LocalDateTime dt = des.deserialize(parser, null);
        LocalDateTime expected = LocalDateTime.of(2023, 9, 14, 10, 48, 9);
        Assertions.assertThat(dt).isEqualTo(expected);
    }
}