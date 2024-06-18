package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a withdrawal transaction with Fragment.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerFragment implements TransactionPartner {

    /**
     * Type of the transaction partner, always “fragment”
     */
    private String type;

    /**
     * Optional. State of the transaction if the transaction is outgoing
     */
    @JsonProperty("withdrawal_state")
    private RevenueWithdrawalState withdrawalState;

}
