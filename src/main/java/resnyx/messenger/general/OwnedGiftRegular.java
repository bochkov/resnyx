package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Gift;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Describes a regular gift owned by a user or a chat.
 */
@Data
@NoArgsConstructor
public final class OwnedGiftRegular implements OwnedGift {

    /**
     * Type of the gift, always “regular”
     */
    private String type;

    /**
     * Information about the regular gift
     */
    private Gift gift;

    /**
     * Optional. Unique identifier of the gift for the bot; for gifts received on behalf of business accounts only
     */
    @JsonProperty("owned_gift_id")
    private String ownedGiftId;

    /**
     * Optional. Sender of the gift if it is a known user
     */
    @JsonProperty("sender_user")
    private User senderUser;

    /**
     * Date the gift was sent in Unix time
     */
    @JsonProperty("send_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime sendDate;

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

    /**
     * Optional. True, if the gift is displayed on the account's profile page; for gifts received on behalf of business accounts only
     */
    @JsonProperty("is_saved")
    private Boolean isSaved;

    /**
     * Optional. True, if the gift can be upgraded to a unique gift; for gifts received on behalf of business accounts only
     */
    @JsonProperty("can_be_upgraded")
    private Boolean canBeUpgraded;

    /**
     * Optional. True, if the gift was refunded and isn't available anymore
     */
    @JsonProperty("was_refunded")
    private Boolean wasRefunded;

    /**
     * Optional. Number of Telegram Stars that can be claimed by the receiver instead of the gift;
     * omitted if the gift cannot be converted to Telegram Stars
     */
    @JsonProperty("convert_star_count")
    private Integer convertStarCount;

    /**
     * Optional. Number of Telegram Stars that were paid by the sender for the ability to upgrade the gift
     */
    @JsonProperty("prepaid_upgrade_star_count")
    private Integer prepaidUpgradeStarCount;
}
