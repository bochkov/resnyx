package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The withdrawal is in progress.
 */
@Data
@NoArgsConstructor
public final class RevenueWithdrawalStatePending implements RevenueWithdrawalState {

    /**
     * Type of the state, always “pending”
     */
    private String type;
}
