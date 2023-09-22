package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StickerFormat {

    STATIC("static"),
    ANIMATED("animated"),
    VIDEO("video");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
