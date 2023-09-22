package resnyx.common;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ParseMode {

    HTML("HTML"),
    MARKDOWN("Markdown"),
    MARKDOWN2("MarkdownV2");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
