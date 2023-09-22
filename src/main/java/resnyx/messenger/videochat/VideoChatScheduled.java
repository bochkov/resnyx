package resnyx.messenger.videochat;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

/**
 * This object represents a service message about a video chat scheduled in the chat.
 */
@Data
@NoArgsConstructor
public final class VideoChatScheduled {

    /**
     * Point in time (Unix timestamp) when the video chat is supposed to be started by a chat administrator
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    @JsonProperty("start_date")
    private LocalDateTime startDate;
}
