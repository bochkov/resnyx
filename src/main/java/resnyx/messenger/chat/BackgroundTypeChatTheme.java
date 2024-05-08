package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The background is taken directly from a built-in chat theme.
 */
@Data
@NoArgsConstructor
public class BackgroundTypeChatTheme implements BackgroundType{

    /**
     * Type of the background, always “chat_theme”
     */
    private String type;

    /**
     * Name of the chat theme, which is usually an emoji
     */
    @JsonProperty("theme_name")
    private String themeName;
}
