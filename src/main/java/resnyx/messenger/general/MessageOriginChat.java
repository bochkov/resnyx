package resnyx.messenger.general;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

/**
 * The message was originally sent on behalf of a chat to a group chat.
 */
@Data
@NoArgsConstructor
public final class MessageOriginChat implements MessageOrigin {

    /**
     * Type of the message origin, always “chat”
     */
    private String type;

    /**
     * Date the message was sent originally in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime date;

    /**
     * Chat that sent the message originally
     */
    @JsonProperty("sender_chat")
    private Chat senderChat;

    /**
     * Optional. For messages originally sent by an anonymous chat administrator, original message author signature
     */
    @JsonProperty("author_signature")
    private String authorSignature;
}
