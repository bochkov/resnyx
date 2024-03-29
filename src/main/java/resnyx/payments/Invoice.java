package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object contains basic information about an invoice.
 */
@Data
@NoArgsConstructor
public final class Invoice {

    /**
     * Product name
     */
    private String title;

    /**
     * Product description
     */
    private String description;

    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice
     */
    @JsonProperty("start_parameter")
    private String startParameter;

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

}
