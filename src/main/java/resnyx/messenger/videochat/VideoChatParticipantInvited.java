package resnyx.messenger.videochat;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.User;

/**
 * This object represents a service message about new members invited to a video chat.
 */
@Data
@NoArgsConstructor
public final class VideoChatParticipantInvited {

    /**
     * New members that were invited to the video chat
     */
    private List<User> users;
}
