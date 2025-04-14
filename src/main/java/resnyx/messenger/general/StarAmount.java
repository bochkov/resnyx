package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes an amount of Telegram Stars.
 */
@Data
@NoArgsConstructor
public final class StarAmount {

    /**
     * Integer amount of Telegram Stars, rounded to 0; can be negative
     */
    private Long amount;

    /**
     * Optional. The number of 1/1000000000 shares of Telegram Stars; from -999999999 to 999999999;
     * can be negative if and only if amount is non-positive
     */
    @JsonProperty("nanostar_amount")
    private Long nanostarAmount;
}
