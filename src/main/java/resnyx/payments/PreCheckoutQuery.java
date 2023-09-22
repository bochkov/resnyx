package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * This object contains information about an incoming pre-checkout query.
 */
@Data
@NoArgsConstructor
public final class PreCheckoutQuery {

    /**
     * Unique query identifier
     */
    private String id;

    /**
     * User who sent the query
     */
    private User from;

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
    private Integer invoicePayload;

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
}
