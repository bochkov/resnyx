package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * The boost was obtained by subscribing to Telegram Premium or by gifting a Telegram Premium subscription to another user.
 */
@Data
@NoArgsConstructor
public final class ChatBoostSourcePremium implements ChatBoostSource {

    /**
     * Source of the boost, always “premium”
     */
    private String source;

    /**
     * User that boosted the chat
     */
    private User user;
}
