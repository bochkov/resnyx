package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The withdrawal failed and the transaction was refunded.
 */
@Data
@NoArgsConstructor
public final class RevenueWithdrawalStateFailed {

    /**
     * Type of the state, always “failed”
     */
    private String type;
}
