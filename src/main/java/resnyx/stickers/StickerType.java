package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StickerType {

    REGULAR("regular"),
    MASK("mask"),
    CUSTOM_EMOJI("custom_emoji");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
