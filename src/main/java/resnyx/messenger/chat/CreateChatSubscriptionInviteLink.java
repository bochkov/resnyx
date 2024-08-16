package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to create a subscription invite link for a channel chat.
 * The bot must have the <i>can_invite_users</i> administrator rights.
 * The link can be edited using the method {@link EditChatSubscriptionInviteLink} or
 * revoked using the method {@link RevokeChatInviteLink}.
 * Returns the new invite link as a {@link ChatInviteLink} object.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class CreateChatSubscriptionInviteLink implements TgMethod {

    /**
     * Unique identifier for the target channel chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Invite link name; 0-32 characters
     */
    private String name;

    /**
     * The number of seconds the subscription will be active for before the next payment.
     * Currently, it must always be 2592000 (30 days).
     */
    @JsonProperty("subscription_period")
    private final Integer subscriptionPeriod;

    /**
     * The amount of Telegram Stars a user must pay initially and after each subsequent subscription period to be a member of the chat; 1-2500
     */
    @JsonProperty("subscription_price")
    private final Integer subscriptionPrice;
}
