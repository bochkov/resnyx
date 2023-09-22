package resnyx.messenger.botcommand;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to change the bot's short description, which is shown on the bot's profile page
 * and is sent together with the link when users share the bot. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetMyShortDescription implements TgMethod {

    /**
     * New short description for the bot; 0-120 characters.
     * Pass an empty string to remove the dedicated short description for the given language.
     */
    @JsonProperty("short_description")
    private String shortDescription;

    /**
     * A two-letter ISO 639-1 language code.
     * If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     */
    @JsonProperty("language_code")
    private String languageCode;

}
