package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.Place;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a venue. By default, the venue will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the venue.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultVenue implements InlineQueryResult {

    /**
     * Type of the result, must be location
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    /**
     * Latitude of the venue location in degrees
     */
    private Double latitude;

    /**
     * Longitude of the venue location in degrees
     */
    private Double longitude;

    /**
     * Title of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue if known
     */
    @JsonUnwrapped(prefix = "foursquare_")
    private Place foursquare;

    /**
     * Optional. Google Places identifier of the venue
     */
    @JsonUnwrapped(prefix = "google_place_")
    private Place googlePlace;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the venue
     */
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

    /**
     * Optional. Url of the thumbnail for the result
     */
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    /**
     * Optional. Thumbnail width
     */
    @JsonProperty("thumbnail_width")
    private Integer thumbnailWidth;

    /**
     * Optional. Thumbnail height
     */
    @JsonProperty("thumbnail_height")
    private Integer thumbnailHeight;
}
