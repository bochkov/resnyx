package resnyx.messenger.botcommand;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.general.InputProfilePhoto;

/**
 * Changes the profile photo of the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyProfilePhoto implements TgMethod {

    /**
     * The new profile photo to set
     */
    private final InputProfilePhoto photo;
}
