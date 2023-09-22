package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents a video message (available in Telegram apps as of v.4.0).
 */
@Data
@NoArgsConstructor
public final class VideoNote {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Video width and height (diameter of the video message) as defined by sender
     */
    private Integer length;

    /**
     * Duration of the video in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumbnail;
}
