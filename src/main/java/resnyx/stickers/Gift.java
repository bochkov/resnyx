package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a gift that can be sent by the bot.
 */
@Data
@NoArgsConstructor
public final class Gift {

    /**
     * Unique identifier of the gift
     */
    private String id;

    /**
     * The sticker that represents the gift
     */
    private Sticker sticker;

    /**
     * The number of Telegram Stars that must be paid to send the sticker
     */
    @JsonProperty("star_count")
    private Integer starCount;

    /**
     * Optional. The number of Telegram Stars that must be paid to upgrade the gift to a unique one
     */
    @JsonProperty("upgrade_star_count")
    private Integer upgradeStarCount;

    /**
     * Optional. The total number of the gifts of this type that can be sent; for limited gifts only
     */
    @JsonProperty("total_count")
    private Integer totalCount;

    /**
     * Optional. The number of remaining gifts of this type that can be sent; for limited gifts only
     */
    @JsonProperty("remaining_count")
    private Integer remainingCount;
}
