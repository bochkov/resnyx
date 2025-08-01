package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Gift;

import java.util.List;

/**
 * Describes a service message about a regular gift that was sent or received.
 */
@Data
@NoArgsConstructor
public final class GiftInfo {

    /**
     * Information about the gift
     */
    private Gift gift;

    /**
     * Optional. Unique identifier of the received gift for the bot; only present for gifts received on behalf of business accounts
     */
    @JsonProperty("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver by converting the gift; omitted if conversion to Telegram Stars is impossible
     */
    @JsonProperty("convert_star_count")
    private Integer convertStarCount;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift
     */
    @JsonProperty("can_be_upgraded")
    private Boolean canBeUpgraded;

    /**
     * Optional. Text of the message that was added to the gift
     */
    private String text;

    /**
     * Optional. Special entities that appear in the text
     */
    private List<MessageEntity> entities;

    /**
     * Optional. True, if the sender and gift text are shown only to the gift receiver; otherwise, everyone will be able to see them
     */
    @JsonProperty("is_private")
    private Boolean isPrivate;
}
