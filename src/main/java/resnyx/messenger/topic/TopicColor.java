package resnyx.messenger.topic;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TopicColor {

    BLUE(7322096), // 0x6FB9F0
    ORANGE(16766590), // 0xFFD67E
    PURPLE(13338331), // 0xCB86DB
    GREEN(9367192), // 0x8EEE98
    PINK(16749490), // 0xFF93B2
    RED(16478047); // 0xFB6F5F

    private final Integer value;

    @JsonValue
    public Integer value() {
        return value;
    }
}
