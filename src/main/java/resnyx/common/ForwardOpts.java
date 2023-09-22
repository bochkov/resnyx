package resnyx.common;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Chat;
import resnyx.messenger.general.User;

@Data
@NoArgsConstructor
public final class ForwardOpts {

    /**
     * Optional. For forwarded messages, sender of the original message
     */
    @JsonProperty("forward_from")
    private User forwardFrom;

    /**
     * Optional. For messages forwarded from channels or from anonymous administrators, information about the original sender chat
     */
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;

    /**
     * Optional. For messages forwarded from channels, identifier of the original message in the channel
     */
    @JsonProperty("forward_from_message_id")
    private Long forwardFromMessageId;

    /**
     * Optional. For forwarded messages that were originally sent in channels or by an anonymous chat administrator,
     * signature of the message sender if present
     */
    @JsonProperty("forward_signature")
    private String forwardSignature;

    /**
     * Optional. Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages
     */
    @JsonProperty("forwardSenderName")
    private String forwardSenderName;

    /**
     * Optional. For forwarded messages, date the original message was sent in Unix time
     */
    @JsonProperty("forward_date")
    private LocalDateTime forwardDate;
}
