package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;
import resnyx.messenger.keyboard.InlineKeyboardMarkup;

/**
 * Represents a location on a map. By default, the location will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the location.
 */
@Data
@NoArgsConstructor
public final class InlineQueryResultLocation implements InlineQueryResult {

    /**
     * Type of the result, must be location
     */
    private String type;

    /**
     * Unique identifier for this result, 1-64 bytes
     */
    private String id;

    @JsonUnwrapped
    private Location location;

    /**
     * Location title
     */
    private String title;

    /**
     * Optional. Inline keyboard attached to the message
     */
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Optional. Content of the message to be sent instead of the location
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
