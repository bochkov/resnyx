package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Place;
import resnyx.common.SendOptions;

/**
 * Use this method to send information about a venue. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendVenue implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Latitude of the venue
     */
    private final Double latitude;

    /**
     * Longitude of the venue
     */
    private final Double longitude;

    /**
     * Name of the venue
     */
    private final String title;

    /**
     * Address of the venue
     */
    private final String address;

    @JsonUnwrapped(prefix = "foursquare_")
    private Place foursquare;

    @JsonUnwrapped(prefix = "google_place_")
    private Place googlePlace;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
