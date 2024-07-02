package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The paid media is a video.
 */
@Data
@NoArgsConstructor
public final class PaidMediaVideo implements PaidMedia {

    /**
     * Type of the paid media, always “video”
     */
    private String type;

    /**
     * The video
     */
    private Video video;
}
