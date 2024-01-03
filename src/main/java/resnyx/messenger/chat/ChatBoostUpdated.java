package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Chat;

/**
 * This object represents a boost added to a chat or changed.
 */
@Data
@NoArgsConstructor
public final class ChatBoostUpdated {

    /**
     * Chat which was boosted
     */
    private Chat chat;

    /**
     * Information about the chat boost
     */
    private ChatBoost boost;
}
