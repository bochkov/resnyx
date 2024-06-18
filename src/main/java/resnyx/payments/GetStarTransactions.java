package resnyx.payments;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Returns the bot's Telegram Star transactions in chronological order.
 * On success, returns a {@link StarTransactions} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetStarTransactions implements TgMethod {

    /**
     * Number of transactions to skip in the response
     */
    private Integer offset;

    /**
     * The maximum number of transactions to be retrieved. Values between 1-100 are accepted.
     * Defaults to 100.
     */
    private Integer limit;
}
