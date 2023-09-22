package resnyx.payments;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents one shipping option.
 */
@Data
@NoArgsConstructor
public final class ShippingOption {

    /**
     * Shipping option identifier
     */
    private String id;

    /**
     * Option title
     */
    private String title;

    /**
     * List of price portions
     */
    private List<LabeledPrice> prices;
}
