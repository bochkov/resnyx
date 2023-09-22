package resnyx.messenger.menubutton;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get the current default administrator rights of the bot.
 * Returns ChatAdministratorRights on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetMyDefaultAdministratorRights implements TgMethod {

    /**
     * Pass True to get default administrator rights of the bot in channels.
     * Otherwise, default administrator rights of the bot for groups and supergroups will be returned.
     */
    @JsonProperty("for_channels")
    private Boolean forChannels;

}
