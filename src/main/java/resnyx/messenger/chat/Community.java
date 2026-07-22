package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a community (a group of chats).
 */
@Data
@NoArgsConstructor
public final class Community {

    /**
     * Unique identifier for this community.
     * This number may have more than 32 significant bits and some programming languages
     * may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits,
     * so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
     */
    private Long id;

    /**
     * Name of the community
     */
    private String name;
}
