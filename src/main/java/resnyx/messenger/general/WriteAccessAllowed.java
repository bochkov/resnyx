package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about a user allowing a bot to write messages after adding the bot to the attachment menu or launching a Web App from a link.
 */
@Data
@NoArgsConstructor
public final class WriteAccessAllowed {

    /**
     * Optional. Name of the Web App which was launched from a link
     */
    @JsonProperty("web_app_name")
    private String webAppName;
}
