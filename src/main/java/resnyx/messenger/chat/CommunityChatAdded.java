package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Describes a service message about a chat being added to a community.
 */
@Data
@NoArgsConstructor
public final class CommunityChatAdded {

    /**
     * The new community to which the chat belongs
     */
    private Community community;
}
