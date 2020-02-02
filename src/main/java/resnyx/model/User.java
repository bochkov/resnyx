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

    /**
     * Optional. True, if the bot can be invited to groups. Returned only in getMe.
     */
    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups;

    /**
     * Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
     */
    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAll;

    /**
     * Optional. True, if the bot supports inline queries. Returned only in getMe.
     */
    @JsonProperty("supports_inline_queries")
    private Boolean supportInline;
}
