package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Chat;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

/**
 * This object represents a boost removed from a chat.
 */
@Data
@NoArgsConstructor
public final class ChatBoostRemoved {

    /**
     * Chat which was boosted
     */
    private Chat chat;

    /**
     * Unique identifier of the boost
     */
    @JsonProperty("boost_id")
    private String boostId;

    /**
     * Point in time (Unix timestamp) when the boost was removed
     */
    @JsonProperty("remove_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime removeDate;

    /**
     * Source of the removed boost
     */
    private ChatBoostSource source;
}
