package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

/**
 * The message was originally sent by a known user.
 */
@Data
@NoArgsConstructor
public final class MessageOriginUser implements MessageOrigin {

    /**
     * Type of the message origin, always “user”
     */
    private String type;

    /**
     * Date the message was sent originally in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * User that sent the message originally
     */
    @JsonProperty("sender_user")
    private User senderUser;
}
