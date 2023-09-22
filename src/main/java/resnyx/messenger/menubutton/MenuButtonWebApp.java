package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.WebAppInfo;

/**
 * Represents a menu button, which launches a Web App.
 */
@Data
@NoArgsConstructor
public final class MenuButtonWebApp implements MenuButton {

    /**
     * Type of the button, must be web_app
     */
    private String type;

    /**
     * Text on the button
     */
    private String text;

    /**
     * Description of the Web App that will be launched when the user presses the button.
     * The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery.
     */
    @JsonProperty("web_app")
    private WebAppInfo webApp;
}
