package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a service message about a user boosting a chat.
 */
@Data
@NoArgsConstructor
public final class ChatBoostAdded {

    /**
     * Number of boosts added by the user
     */
    @JsonProperty("boost_count")
    private Integer boostCount;
}
