package resnyx.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.PaidMedia;
import resnyx.messenger.general.User;
import resnyx.stickers.Gift;

import java.util.List;

/**
 * Describes a transaction with a user.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerUser implements TransactionPartner {

    /**
     * Type of the transaction partner, always “user”
     */
    private String type;

    /**
     * Type of the transaction, currently one of
     * “invoice_payment” for payments via invoices,
     * “paid_media_payment” for payments for paid media,
     * “gift_purchase” for gifts sent by the bot,
     * “premium_purchase” for Telegram Premium subscriptions gifted by the bot,
     * “business_account_transfer” for direct transfers from managed business accounts
     */
    @JsonProperty("transaction_type")
    private String transactionType;

    /**
     * Information about the user
     */
    private User user;

    /**
     * Optional. Information about the affiliate that received a commission via this transaction
     */
    private AffiliateInfo affiliate;

    /**
     * Optional. Bot-specified invoice payload
     */
    @JsonProperty("invoice_payload")
    private String invoicePayload;

    /**
     * Optional. The duration of the paid subscription
     */
    @JsonProperty("subscription_period")
    private Integer subscriptionPeriod;

    /**
     * Optional. Information about the paid media bought by the user
     */
    @JsonProperty("paid_media")
    private List<PaidMedia> paidMedia;

    /**
     * Optional. Bot-specified paid media payload
     */
    @JsonProperty("paid_media_payload")
    private String paidMediaPayload;

    /**
     * Optional. The gift sent to the user by the bot; for “gift_purchase” transactions only
     */
    private Gift gift;

    /**
     * Optional. Number of months the gifted Telegram Premium subscription will be active for; for “premium_purchase” transactions only
     */
    @JsonProperty("premium_subscription_duration")
    private Integer premiumSubscriptionDuration;
}
