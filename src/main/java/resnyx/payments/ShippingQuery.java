package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * This object contains information about an incoming shipping query.
 */
@Data
@NoArgsConstructor
public final class ShippingQuery {

    /**
     * Unique query identifier
     */
    private String id;

    /**
     * User who sent the query
     */
    private User from;

    /**
     * Bot specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * User specified shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
}
