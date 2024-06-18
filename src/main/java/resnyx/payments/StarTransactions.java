package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Contains a list of Telegram Star transactions.
 */
@Data
@NoArgsConstructor
public final class StarTransactions {

    /**
     * The list of transactions
     */
    private List<StarTransaction> transactions;

}
