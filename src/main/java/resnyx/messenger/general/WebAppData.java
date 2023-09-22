package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes data sent from a Web App to the bot.
 */
@Data
@NoArgsConstructor
public final class WebAppData {

    /**
     * The data. Be aware that a bad client can send arbitrary data in this field.
     */
    private String data;

    /**
     * Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad client can send arbitrary data in this field.
     */
    @JsonProperty("button_text")
    private String buttonText;
}
