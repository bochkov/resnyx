package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Allows the bot to cancel or re-enable extension of a subscription paid in Telegram Stars.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class EditUserStarSubscription implements TgMethod {

    /**
     * Identifier of the user whose subscription will be edited
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * Telegram payment identifier for the subscription
     */
    @JsonProperty("telegram_payment_charge_id")
    private final String telegramPaymentChargeId;

    /**
     * Pass True to cancel extension of the user subscription;
     * the subscription must be active up to the end of the current subscription period.
     * Pass False to allow the user to re-enable a subscription that was previously canceled by the bot.
     */
    @JsonProperty("is_cancelled")
    private final Boolean isCancelled;
}
