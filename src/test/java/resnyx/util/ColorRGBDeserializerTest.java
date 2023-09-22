package resnyx.util;

import java.awt.*;

import com.fasterxml.jackson.core.JsonParser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import resnyx.util.ColorRGBDeserializer;

@ExtendWith(MockitoExtension.class)
class ColorRGBDeserializerTest {

    @Mock
    JsonParser parser;

    @Test
    void test() throws Exception {
        Mockito.when(parser.getIntValue()).thenReturn(7542582);
        Color testColor = new Color(115, 23, 54);
        Color color = new ColorRGBDeserializer().deserialize(parser, null);
        Assertions.assertThat(color).isEqualTo(testColor);
    }

}