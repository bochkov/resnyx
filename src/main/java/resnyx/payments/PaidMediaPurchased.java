package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * This object contains information about a paid media purchase.
 */
@Data
@NoArgsConstructor
public final class PaidMediaPurchased {

    /**
     * User who purchased the media
     */
    private User from;

    /**
     * Bot-specified paid media payload
     */
    @JsonProperty("paid_media_payload")
    private String paidMediaPayload;
}
