package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents information about an order.
 */
@Data
@NoArgsConstructor
public final class OrderInfo {

    /**
     * Optional. User name
     */
    private String name;

    /**
     * Optional. User's phone number
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * Optional. User email
     */
    private String email;

    /**
     * Optional. User shipping address
     */
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
}
