package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDateTime;

/**
 * This object contains basic information about a successful payment.
 */
@Data
@NoArgsConstructor
public final class SuccessfulPayment {

    /**
     * Three-letter ISO 4217 currency code
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    @JsonProperty("total_amount")
    private Integer totalAmount;

    /**
     * Bot specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * Optional. Expiration date of the subscription, in Unix time; for recurring payments only
     */
    @JsonProperty("subscription_expiration_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime subscriptionExpirationDate;

    /**
     * Optional. True, if the payment is a recurring payment for a subscription
     */
    @JsonProperty("is_recurring")
    private Boolean isRecurring;

    /**
     * Optional. True, if the payment is the first payment for a subscription
     */
    @JsonProperty("is_first_recurring")
    private Boolean isFirstRecurring;

    /**
     * Optional. Identifier of the shipping option chosen by the user
     */
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;

    /**
     * Optional. Order information provided by the user
     */
    @JsonProperty("order_info")
    private OrderInfo orderInfo;

    /**
     * Telegram payment identifier
     */
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId;

    /**
     * Provider payment identifier
     */
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId;
}
