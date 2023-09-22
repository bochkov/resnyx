package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MaskPoint {

    FOREHEAD("forehead"),
    EYES("eyes"),
    MOUTH("mouth"),
    CHIN("chin");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
