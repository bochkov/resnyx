
package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.TgMethodName;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit live location messages.
 * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
 * On success True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
@TgMethodName("editMessageLiveLocation")
public final class EditInlineMessageLiveLocation implements TgMethod {

    /**
     * Identifier of the inline message
     */
    @JsonProperty("inline_message_id")
    private final String inlineMessageId;

    /**
     * Latitude of new location
     */
    private final Double latitude;

    /**
     * Longitude of new location
     */
    private final Double longitude;

    /**
     * The radius of uncertainty for the location, measured in meters; 0-1500
     */
    @JsonProperty("horizontal_accuracy")
    private Integer horizontalAccuracy;

    /**
     * Direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     */
    @JsonProperty("heading")
    private Integer heading;

    /**
     * The maximum distance for proximity alerts about approaching another chat member, in meters.
     * Must be between 1 and 100000 if specified.
     */
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius;

    /**
     * A JSON-serialized object for a new inline keyboard
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

}
