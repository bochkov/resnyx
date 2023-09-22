package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete the list of the bot's commands for the given scope and user language.
 * After deletion, higher level commands will be shown to affected users. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteMyCommands implements TgMethod {

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
