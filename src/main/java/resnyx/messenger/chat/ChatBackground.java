package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a chat background.
 */
@Data
@NoArgsConstructor
public final class ChatBackground {

    /**
     * Type of the background
     */
    private BackgroundType type;
}
