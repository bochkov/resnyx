package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a message about a forwarded story in the chat. Currently holds no information.
 */
@Data
@NoArgsConstructor
public final class Story {

    /**
     * Unique identifier for the story in the chat
     */
    private Integer id;

    /**
     * Chat that posted the story
     */
    private Chat chat;
}
