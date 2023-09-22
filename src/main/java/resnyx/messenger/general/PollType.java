package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PollType {

    REGULAR("regular"),
    QUIZ("quiz");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
