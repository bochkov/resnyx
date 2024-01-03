package resnyx.messenger.keyboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object defines the criteria used to request a suitable user.
 * The identifier of the selected user will be shared with the bot when the corresponding button is pressed.
 */
@Data
@NoArgsConstructor
public final class KeyboardButtonRequestUsers {

    /**
     * Signed 32-bit identifier of the request, which will be received back in the UserShared object.
     * Must be unique within the message
     */
    @JsonProperty("request_id")
    private Long requestId;

    /**
     * Optional. Pass True to request a bot, pass False to request a regular user.
     * If not specified, no additional restrictions are applied.
     */
    @JsonProperty("user_is_bot")
    private Boolean userIsBot;

    /**
     * Optional. Pass True to request a premium user, pass False to request a non-premium user.
     * If not specified, no additional restrictions are applied.
     */
    @JsonProperty("user_is_premium")
    private Boolean userIsPremium;

    /**
     * Optional. The maximum number of users to be selected; 1-10. Defaults to 1.
     */
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
}
