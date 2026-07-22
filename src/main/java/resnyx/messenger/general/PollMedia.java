package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Sticker;

import java.util.List;

/**
 * At most one of the optional fields can be present in any given object.
 */
@Data
@NoArgsConstructor
public final class PollMedia {

    /**
     * Optional. Media is an animation, information about the animation
     */
    private Animation animation;

    /**
     * Optional. Media is an audio file, information about the file; currently, can't be received in a poll option
     */
    private Audio audio;

    /**
     * Optional. Media is a general file, information about the file; currently, can't be received in a poll option
     */
    private Document document;

    /**
     * Optional. The HTTP link attached to the poll option
     */
    private Link link;

    /**
     * Optional. Media is a live photo, information about the live photo
     */
    @JsonProperty("live_photo")
    private LivePhoto livePhoto;

    /**
     * Optional. Media is a shared location, information about the location
     */
    private Location location;

    /**
     * Optional. Media is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * Optional. Media is a sticker, information about the sticker; currently, for poll options only
     */
    private Sticker sticker;

    /**
     * Optional. Media is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Optional. Media is a video, information about the video
     */
    private Video video;
}
