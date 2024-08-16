package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PaidMedia;
import resnyx.messenger.general.User;

import java.util.List;

/**
 * Describes a transaction with a user.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerUser implements TransactionPartner {

    /**
     * Type of the transaction partner, always “user”
     */
    private String type;

    /**
     * Information about the user
     */
    private User user;

    /**
     * Optional. Bot-specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * Optional. Information about the paid media bought by the user
     */
    @JsonProperty("paid_media")
    private List<PaidMedia> paidMedia;
}
