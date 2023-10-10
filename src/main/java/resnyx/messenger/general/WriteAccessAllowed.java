package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about a user allowing a bot to write messages after adding it to the attachment menu,
 * launching a Web App from a link, or accepting an explicit request from a Web App sent by the method requestWriteAccess.
 */
@Data
@NoArgsConstructor
public final class WriteAccessAllowed {

    /**
     * Optional. True, if the access was granted after the user accepted an explicit request from a Web App sent by the method requestWriteAccess
     */
    @JsonProperty("from_request")
    private Boolean fromRequest;

    /**
     * Optional. Name of the Web App which was launched from a link
     */
    @JsonProperty("web_app_name")
    private String webAppName;

    /**
     * Optional. True, if the access was granted when the bot was added to the attachment or side menu
     */
    @JsonProperty("from_attachment_menu")
    private Boolean fromAttachMenu;
}
