package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the bot's description, which is shown in the chat with the bot if the chat is empty.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyDescription implements TgMethod {

    /**
     * New bot description; 0-512 characters.
     * Pass an empty string to remove the dedicated description for the given language.
     */
    private String description;

    /**
     * A two-letter ISO 639-1 language code.
     * If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     */
    @JsonProperty("language_code")
    private String languageCode;

}
