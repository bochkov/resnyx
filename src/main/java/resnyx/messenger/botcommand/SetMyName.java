package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the bot's name. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyName implements TgMethod {

    /**
     * New bot name; 0-64 characters. Pass an empty string to remove the dedicated name for the given language.
     */
    private String name;

    /**
     * A two-letter ISO 639-1 language code.
     * If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     */
    @JsonProperty("language_code")
    private String languageCode;

}
