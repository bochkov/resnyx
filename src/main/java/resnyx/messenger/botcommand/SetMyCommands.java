package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

import java.util.List;

/**
 * Use this method to change the list of the bot's commands. See this manual for more details about bot commands.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyCommands implements TgMethod {

    /**
     * A JSON-serialized list of bot commands to be set as the list of the bot's commands.
     * At most 100 commands can be specified.
     */
    private final List<BotCommand> commands;

    /**
     * A JSON-serialized object, describing scope of users for which the commands are relevant.
     * Defaults to BotCommandScopeDefault.
     */
    private BotCommandScope scope;

    /**
     * A two-letter ISO 639-1 language code.
     * If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     */
    @JsonProperty("language_code")
    private String languageCode;

}
