package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains basic information about a refunded payment.
 */
@Data
@NoArgsConstructor
public final class RefundedPayment {

    /**
     * Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars. Currently, always “XTR”
     */
    private String currency;

    /**
     * Total refunded price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45, total_amount = 145.
     * See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies)
     */
    private Integer totalAmount;

    /**
     * Bot-specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * Telegram payment identifier
     */
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId;

    /**
     * Optional. Provider payment identifier
     */
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId;
}
