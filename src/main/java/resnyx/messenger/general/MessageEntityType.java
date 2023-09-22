package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MessageEntityType {

    MENTION("mention"),
    HASHTAG("hashtag"),
    CASHTAG("cashtag"),
    BOT_COMMAND("bot_command"),
    URL("url"),
    EMAIL("email"),
    PHONE_NUMBER("phone_number"),
    BOLD("bold"),
    ITALIC("italic"),
    UNDERLINE("underline"),
    STRIKETHROUGH("strikethrough"),
    SPOILER("spoiler"),
    CODE("code"),
    PRE("pre"),
    TEXT_LINK("text_link"),
    TEXT_MENTION("text_mention"),
    CUSTOM_EMOJI("custom_emoji");

    private final String value;

    @JsonValue
    public String value() {
        return value;
    }
}
