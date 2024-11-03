package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a transaction with payment for paid broadcasting.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerTelegramApi implements TransactionPartner {

    /**
     * Type of the transaction partner, always “telegram_api”
     */
    private String type;

    /**
     * The number of successful requests that exceeded regular limits and were therefore billed
     */
    @JsonProperty("request_count")
    private Integer requestCount;
}
