package resnyx.payments;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.gifts.Gift;
import resnyx.messenger.general.Chat;

/**
 * Describes a transaction with a chat.
 */
@Data
@NoArgsConstructor
public final class TransactionPartnerChat implements TransactionPartner {

    /**
     * Type of the transaction partner, always “chat”
     */
    private String type;

    /**
     * Information about the chat
     */
    private Chat chat;

    /**
     * Optional. The gift sent to the chat by the bot
     */
    private Gift gift;
}
