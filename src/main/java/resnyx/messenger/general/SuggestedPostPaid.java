package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a service message about a successful payment for a suggested post.
 */
@Data
@NoArgsConstructor
public final class SuggestedPostPaid {

    /**
     * Optional. Message containing the suggested post.
     * Note that the Message object in this field will not contain the reply_to_message field even if it itself is a reply.
     */
    @JsonProperty("suggested_post_message")
    private Message suggestedPostMessage;

    /**
     * Currency in which the payment was made. Currently, one of “XTR” for Telegram Stars or “TON” for toncoins
     */
    private String currency;

    /**
     * Optional. The amount of the currency that was received by the channel in nanotoncoins; for payments in toncoins only
     */
    private Long amount;

    /**
     * Optional. The amount of Telegram Stars that was received by the channel; for payments in Telegram Stars only
     */
    @JsonProperty("star_amount")
    private StarAmount starAmount;
}
