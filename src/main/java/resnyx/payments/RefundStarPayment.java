package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Refunds a successful payment in Telegram Stars. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RefundStarPayment implements TgMethod {

    /**
     * Identifier of the user whose payment will be refunded
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Telegram payment identifier
     */
    @JsonProperty("telegram_payment_charge_id")
    private final String telegramPaymentChargeId;
}
