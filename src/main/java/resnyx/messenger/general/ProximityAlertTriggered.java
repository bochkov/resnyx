package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents the content of a service message, sent whenever a user in the chat triggers a proximity alert set by another user.
 */
@Data
@NoArgsConstructor
public final class ProximityAlertTriggered {

    /**
     * User that triggered the alert
     */
    private User traveler;

    /**
     * User that set the alert
     */
    private User watcher;

    /**
     * The distance between the users
     */
    private Integer distance;
}
