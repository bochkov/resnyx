package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

/**
 * This object contains information about a chat boost.
 */
@Data
@NoArgsConstructor
public final class ChatBoost {

    /**
     * Unique identifier of the boost
     */
    @JsonProperty("boost_id")
    private String boostId;

    /**
     * Point in time (Unix timestamp) when the chat was boosted
     */
    @JsonProperty("add_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime addDate;

    /**
     * Point in time (Unix timestamp) when the boost will automatically expire, unless the booster's Telegram Premium subscription is prolonged
     */
    @JsonProperty("expiration_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime expirationDate;

    /**
     * Source of the added boost
     */
    private ChatBoostSource source;
}
