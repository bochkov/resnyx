package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a Telegram user or bot.
 */
@Data
public final class User {

    /**
     * Unique identifier for this user or bot
     */
    private Long id;

    /**
     * True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private Boolean isBot;

    /**
     * User‘s or bot’s first name
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Optional. User‘s or bot’s last name
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Optional. User‘s or bot’s username
     */
    private String username;

    /**
     * Optional. <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language</a> tag of the user's language
     */
    @JsonProperty("language_code")
    private String languageCode;
}
