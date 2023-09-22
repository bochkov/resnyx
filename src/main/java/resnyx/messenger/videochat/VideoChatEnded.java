package resnyx.messenger.videochat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about a video chat ended in the chat.
 */
@Data
@NoArgsConstructor
public final class VideoChatEnded {

    /**
     * Video chat duration in seconds
     */
    private Integer duration;
}
