package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a service message about the failed approval of a suggested post.
 * Currently, only caused by insufficient user funds at the time of approval.
 */
@Data
@NoArgsConstructor
public final class SuggestedPostApprovalFailed {

    /**
     * Optional. Message containing the suggested post whose approval has failed.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Expected price of the post
     */
    private SuggestedPostPrice price;
}
