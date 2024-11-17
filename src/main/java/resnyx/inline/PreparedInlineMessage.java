package resnyx.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDateTime;

/**
 * Describes an inline message to be sent by a user of a Mini App.
 */
@Data
@NoArgsConstructor
public final class PreparedInlineMessage {

    /**
     * Unique identifier of the prepared message
     */
    private String id;

    /**
     * Expiration date of the prepared message, in Unix time. Expired prepared messages can no longer be used
     */
    @JsonProperty("expiration_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime expirationDate;
}
