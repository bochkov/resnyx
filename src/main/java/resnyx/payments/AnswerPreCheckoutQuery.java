package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Once the user has confirmed their payment and shipping details, the Bot API sends the final confirmation
 * in the form of an Update with the field pre_checkout_query. Use this method to respond to such pre-checkout queries.
 * On success, True is returned.
 * Note: The Bot API must receive an answer within 10 seconds after the pre-checkout query was sent.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerPreCheckoutQuery implements TgMethod {

    /**
     * Unique identifier for the query to be answered
     */
    @JsonProperty("pre_checkout_query_id")
    private final String preCheckoutQueryId;

    /**
     * Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order.
     * Use False if there are any problems.
     */
    private final Boolean ok;

    /**
     * Required if ok is False. Error message in human readable form that explains the reason for failure
     * to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts
     * while you were busy filling out your payment details. Please choose a different color or garment!").
     * Telegram will display this message to the user.
     */
    @JsonProperty("error_message")
    private String errorMessage;

}
