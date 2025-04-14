package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Returns the gifts received and owned by a managed business account.
 * Requires the <i>can_view_gifts_and_stars</i> business bot right.
 * Returns {@link resnyx.messenger.general.OwnedGifts} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetBusinessAccountGifts implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Pass True to exclude gifts that aren't saved to the account's profile page
     */
    @JsonProperty("exclude_unsaved")
    private Boolean excludeUnsaved;

    /**
     * Pass True to exclude gifts that are saved to the account's profile page
     */
    @JsonProperty("exclude_saved")
    private Boolean excludeSaved;

    /**
     * Pass True to exclude gifts that can be purchased an unlimited number of times
     */
    @JsonProperty("exclude_unlimited")
    private Boolean excludeUnlimited;

    /**
     * Pass True to exclude gifts that can be purchased a limited number of times
     */
    @JsonProperty("exclude_limited")
    private Boolean excludeLimited;

    /**
     * Pass True to exclude unique gifts
     */
    @JsonProperty("exclude_limit")
    private Boolean excludeLimit;

    /**
     * Pass True to sort results by gift price instead of send date. Sorting is applied before pagination.
     */
    @JsonProperty("sort_by_price")
    private Boolean sortByPrice;

    /**
     * Offset of the first entry to return as received from the previous request;
     * use empty string to get the first chunk of results
     */
    private String offset;

    /**
     * The maximum number of gifts to be returned; 1-100. Defaults to 100
     */
    private Integer limit;
}
