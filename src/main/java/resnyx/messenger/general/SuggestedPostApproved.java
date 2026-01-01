package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;

/**
 * Describes a service message about the approval of a suggested post.
 */
@Data
@NoArgsConstructor
public final class SuggestedPostApproved {

    /**
     * Optional. Message containing the suggested post.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Optional. Amount paid for the post
     */
    private SuggestedPostPrice price;

    @JsonProperty("send_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDate sendDate;
}
