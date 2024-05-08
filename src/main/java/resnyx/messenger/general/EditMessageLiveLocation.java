package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Use this method to edit live location messages.
 * A location can be edited until its live_period expires or editing is explicitly disabled by a call to stopMessageLiveLocation.
 * On success the edited Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditMessageLiveLocation implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the message to edit
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * Latitude of new location
     */
    private final Double latitude;

    /**
     * Longitude of new location
     */
    private final Double longitude;

    /**
     * New period in seconds during which the location can be updated, starting from the message send date.
     * If 0x7FFFFFFF is specified, then the location can be updated forever.
     * Otherwise, the new value must not exceed the current live_period by more than a day,
     * and the live location expiration date must remain within the next 90 days.
     * If not specified, then live_period remains unchanged
     */
    @JsonProperty("live_period")
    private final Integer livePeriod;

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
