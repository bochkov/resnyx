package resnyx.messenger.general;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

/**
 * The message was originally sent to a channel chat.
 */
@Data
@NoArgsConstructor
public final class MessageOriginChannel implements MessageOrigin {

    /**
     * Type of the message origin, always “channel”
     */
    private String type;

    /**
     * Date the message was sent originally in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * Channel chat to which the message was originally sent
     */
    @JsonProperty("sender_chat")
    private Chat senderChat;

    /**
     * Unique message identifier inside the chat
     */
    @JsonProperty("message_id")
    private Long messageId;

    /**
     * Optional. Signature of the original post author
     */
    @JsonProperty("author_signature")
    private String authorSignature;
}
