package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Location;

/**
 * Represents a location to which a chat is connected.
 */
@Data
@NoArgsConstructor
public final class ChatLocation {

    /**
     * The location to which the supergroup is connected. Can't be a live location.
     */
    private Location location;

    /**
     * Location address; 1-64 characters, as defined by the chat owner
     */
    private String address;
}
