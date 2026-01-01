package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * The boost was obtained by the creation of Telegram Premium gift codes to boost a chat.
 * Each such code boosts the chat 4 times for the duration of the corresponding Telegram Premium subscription.
 */
@Data
@NoArgsConstructor
public final class ChatBoostSourceGiftCode implements ChatBoostSource {

    /**
     * Source of the boost, always “gift_code”
     */
    private String source;

    /**
     * User for which the gift code was created
     */
    private User user;
}
