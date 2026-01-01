package resnyx.messenger.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.gifts.AcceptedGiftTypes;

/**
 * Changes the privacy settings pertaining to incoming gifts in a managed business account.
 * Requires the <i>can_change_gift_settings</i> business bot right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetBusinessAccountGiftSettings implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Pass True, if a button for sending a gift to the user or by the business account must always be shown in the input field
     */
    @JsonProperty("show_gift_button")
    private final Boolean showGiftButton;

    /**
     * Types of gifts accepted by the business account
     */
    @JsonProperty("accepted_gift_types")
    private AcceptedGiftTypes acceptedGiftTypes;
}
