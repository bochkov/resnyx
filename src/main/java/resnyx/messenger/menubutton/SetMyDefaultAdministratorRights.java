package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.messenger.chat.ChatAdministratorRights;

/**
 * Use this method to change the default administrator rights requested by the bot when it's added as an administrator to groups or channels.
 * These rights will be suggested to users, but they are free to modify the list before adding the bot.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyDefaultAdministratorRights implements TgMethod {

    /**
     * A JSON-serialized object describing new default administrator rights.
     * If not specified, the default administrator rights will be cleared.
     */
    private ChatAdministratorRights rights;

    /**
     * Pass True to change the default administrator rights of the bot in channels.
     * Otherwise, the default administrator rights of the bot for groups and supergroups will be changed.
     */
    @JsonProperty("for_channels")
    private Boolean forChannels;

}
