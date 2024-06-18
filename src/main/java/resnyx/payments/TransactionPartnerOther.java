package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a transaction with an unknown source or recipient.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerOther {

    /**
     * Type of the transaction partner, always “other”
     */
    private String type;
}
