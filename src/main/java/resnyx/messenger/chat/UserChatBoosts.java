package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * This object represents a list of boosts added to a chat by a user.
 */
@Data
@NoArgsConstructor
public final class UserChatBoosts {

    /**
     * The list of boosts added to the chat by the user
     */
    private List<ChatBoost> boosts;
}
