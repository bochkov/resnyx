package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDate;

/**
 * Describes a Telegram Star transaction.
 */
@Data
@NoArgsConstructor
public final class StarTransaction {

    /**
     * Unique identifier of the transaction. Coincides with the identifier of the original transaction for refund transactions.
     * Coincides with SuccessfulPayment.telegram_payment_charge_id for successful incoming payments from users.
     */
    private String id;

    /**
     * Number of Telegram Stars transferred by the transaction
     */
    private Integer amount;

    /**
     * Optional. The number of 1/1000000000 shares of Telegram Stars transferred by the transaction; from 0 to 999999999
     */
    @JsonProperty("nanostar_amount")
    private Long nanoStarAmount;

    /**
     * Date the transaction was created in Unix time
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDate date;

    /**
     * Optional. Source of an incoming transaction (e.g., a user purchasing goods or services, Fragment refunding a failed withdrawal).
     * Only for incoming transactions
     */
    private TransactionPartner source;

    /**
     * Optional. Receiver of an outgoing transaction (e.g., a user for a purchase refund, Fragment for a withdrawal).
     * Only for outgoing transactions
     */
    private TransactionPartner receiver;
}
