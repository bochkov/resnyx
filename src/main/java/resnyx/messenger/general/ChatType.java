package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChatType {

    PRIVATE("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
