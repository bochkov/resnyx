package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The paid media is a live photo.
 */
@Data
@NoArgsConstructor
public final class PaidMediaLivePhoto implements PaidMedia {

    /**
     * Type of the paid media, always “live_photo”
     */
    private String type;

    /**
     * The photo
     */
    @JsonProperty("live_photo")
    private LivePhoto livePhoto;
}
