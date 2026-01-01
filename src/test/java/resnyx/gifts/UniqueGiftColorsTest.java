package resnyx.gifts;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;

import java.awt.*;
import java.util.Arrays;

class UniqueGiftColorsTest {

    JsonMapper mapper = JsonMapper.builder()
            .build();

    @Test
    void testColorsArray() {
        String json = """
                {
                    "model_custom_emoji_id" : "premium",
                    "symbol_custom_emoji_id": "",
                    "light_theme_main_color": 7542582,
                    "light_theme_other_colors": [ 7512510, 7562530, 7572550 ],
                    "dark_theme_main_color": 7542582,
                    "dark_theme_other_colors": [ 7512510, 7562530, 7572550 ]
                }
                """;
        UniqueGiftColors colors = mapper.readValue(json.getBytes(), UniqueGiftColors.class);
        Assertions.assertThat(colors.getLightThemeMainColor())
                .isEqualTo(new Color(115, 23, 54));
        Assertions.assertThat(colors.getLightThemeOtherColors())
                .isEqualTo(Arrays.asList(new Color(114, 161, 190), new Color(115, 101, 34), new Color(115, 140, 70)));
        Assertions.assertThat(colors.getDarkThemeMainColor())
                .isEqualTo(new Color(115, 23, 54));
        Assertions.assertThat(colors.getDarkThemeOtherColors())
                .isEqualTo(Arrays.asList(new Color(114, 161, 190), new Color(115, 101, 34), new Color(115, 140, 70)));
    }
}