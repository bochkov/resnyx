package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Returns the gifts owned by a chat. Returns {@link OwnedGifts} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetChatGifts implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Pass True to exclude gifts that aren't saved to the chat's profile page.
     * Always True, unless the bot has the can_post_messages administrator right in the channel.
     */
    @JsonProperty("exclude_unsaved")
    private Boolean excludeUnsaved;

    /**
     * Pass True to exclude gifts that are saved to the chat's profile page.
     * Always False, unless the bot has the can_post_messages administrator right in the channel.
     */
    @JsonProperty("exclude_saved")
    private Boolean excludeSaved;

    /**
     * Pass True to exclude gifts that can be purchased an unlimited number of times
     */
    @JsonProperty("exclude_unlimited")
    private Boolean excludeUnlimited;

    /**
     * Pass True to exclude gifts that can be purchased a limited number of times and can be upgraded to unique
     */
    @JsonProperty("exclude_limited_upgradable")
    private Boolean excludeLimitedUpgradable;

    /**
     * Pass True to exclude gifts that can be purchased a limited number of times and can't be upgraded to unique
     */
    @JsonProperty("exclude_limited_non_upgradable")
    private Boolean excludeLimitedNonUpgradable;

    /**
     * Pass True to exclude gifts that were assigned from the TON blockchain and can't be resold or transferred in Telegram
     */
    @JsonProperty("exclude_from_blockchain")
    private Boolean excludeFromBlockchain;

    /**
     * Pass True to exclude unique gifts
     */
    @JsonProperty("exclude_unique")
    private Boolean excludeUnique;

    /**
     * Pass True to sort results by gift price instead of send date. Sorting is applied before pagination.
     */
    @JsonProperty("sort_by_price")
    private Boolean sortByPrice;

    /**
     * Offset of the first entry to return as received from the previous request;
     * use an empty string to get the first chunk of results
     */
    private String offset;

    /**
     * The maximum number of gifts to be returned; 1-100. Defaults to 100
     */
    private Integer limit;
}
