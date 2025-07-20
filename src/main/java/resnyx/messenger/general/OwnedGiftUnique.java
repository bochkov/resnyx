package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Gift;
import resnyx.util.UnixTimeDeserializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Describes a unique gift received and owned by a user or a chat.
 */
@Data
@NoArgsConstructor
public final class OwnedGiftUnique implements OwnedGift {

    /**
     * Type of the gift, always “unique”
     */
    private String type;

    /**
     * Information about the unique gift
     */
    private Gift gift;

    /**
     * Optional. Unique identifier of the received gift for the bot; for gifts received on behalf of business accounts only
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
     * Optional. True, if the gift is displayed on the account's profile page; for gifts received on behalf of business accounts only
     */
    @JsonProperty("is_saved")
    private Boolean isSaved;

    /**
     * Optional. True, if the gift can be transferred to another owner; for gifts received on behalf of business accounts only
     */
    @JsonProperty("can_be_transferred")
    private Boolean canBeTransferred;

    /**
     * Optional. Number of Telegram Stars that must be paid to transfer the gift; omitted if the bot cannot transfer the gift
     */
    @JsonProperty("transfer_star_count")
    private Integer transferStarCount;

    /**
     * Optional. Point in time (Unix timestamp) when the gift can be transferred.
     * If it is in the past, then the gift can be transferred now
     */
    @JsonProperty("next_transfer_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime nextTransferDate;

}
