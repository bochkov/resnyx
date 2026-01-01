package resnyx.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tools.jackson.core.JsonParser;

import java.awt.*;

@ExtendWith(MockitoExtension.class)
class ColorRGBDeserializerTest {

    @Mock
    JsonParser parser;

    @Test
    void test() {
        Mockito.when(parser.getIntValue()).thenReturn(7542582);
        Color testColor = new Color(115, 23, 54);
        Color color = new ColorRGBDeserializer().deserialize(parser, null);
        Assertions.assertThat(color).isEqualTo(testColor);
    }

}