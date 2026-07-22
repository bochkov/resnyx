package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * This object contains information about changes to a user payment subscription toward the current bot.
 */
@Data
@NoArgsConstructor
public final class BotSubscriptionUpdated {

    /**
     * User who subscribed for payments toward the bot
     */
    private User user;

    /**
     * Bot-specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * The new state of the subscription.
     * Currently, it can be one of “canceled” if the user canceled the subscription,
     * “active” if the user re-enabled a previously canceled subscription,
     * or “failed” if payment for the subscription failed.
     */
    private State state;

    @RequiredArgsConstructor
    public enum State {

        CANCELED("canceled"),
        ACTIVE("active"),
        FAILED("failed");

        @JsonValue
        private final String value;

    }
}
