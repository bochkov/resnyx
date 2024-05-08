package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * This object describes the type of a background. Currently, it can be one of
 * BackgroundTypeFill
 * BackgroundTypeWallpaper
 * BackgroundTypePattern
 * BackgroundTypeChatTheme
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "fill", value = BackgroundTypeFill.class),
        @JsonSubTypes.Type(name = "wallpaper", value = BackgroundTypeWallpaper.class),
        @JsonSubTypes.Type(name = "pattern", value = BackgroundTypePattern.class),
        @JsonSubTypes.Type(name = "chat_theme", value = BackgroundTypeChatTheme.class)
})
public interface BackgroundType {
}
