package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class MessageId {

    /**
     * Unique message identifier
     */
    @JsonProperty("message_id")
    private Long id;
}
