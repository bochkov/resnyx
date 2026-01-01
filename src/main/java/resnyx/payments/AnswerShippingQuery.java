package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified,
 * the Bot API will send an Update with a shipping_query field to the bot. Use this method to reply to shipping queries.
 * On success, True is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class AnswerShippingQuery implements TgMethod {

    /**
     * Unique identifier for the query to be answered
     */
    @JsonProperty("shipping_query_id")
    private final String shippingQueryId;

    /**
     * Pass True if delivery to the specified address is possible and False if there are any problems
     * (for example, if delivery to the specified address is not possible)
     */
    private final Boolean ok;

    /**
     * Required if ok is True. A JSON-serialized array of available shipping options.
     */
    @JsonProperty("shipping_options")
    private List<ShippingOption> shippingOptions;

    /**
     * Required if ok is False. Error message in human readable form that explains why it is impossible
     * to complete the order (e.g. "Sorry, delivery to your desired address is unavailable').
     * Telegram will display this message to the user.
     */
    @JsonProperty("error_message")
    private String errorMessage;

}
