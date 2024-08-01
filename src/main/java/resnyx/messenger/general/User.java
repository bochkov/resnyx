package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents a Telegram user or bot.
 */
@Data
@NoArgsConstructor
public final class User {

    /**
     * Unique identifier for this user or bot.
     * This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
     */
    private Long id;

    /**
     * True, if this user is a bot
     */
    @JsonProperty("is_bot")
    private Boolean isBot;

    /**
     * User's or bot's first name
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Optional. User's or bot's last name
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Optional. User's or bot's username
     */
    private String username;

    /**
     * Optional. IETF language tag of the user's language
     */
    @JsonProperty("language_code")
    private String languageCode;

    @JsonProperty("is_premium")
    private Boolean isPremium;

    /**
     * Optional. True, if this user added the bot to the attachment menu
     */
    @JsonProperty("added_to_attachment_menu")
    private Boolean addedToAttachmentMenu;

    /**
     * Optional. True, if the bot can be invited to groups. Returned only in getMe.
     */
    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups;

    /**
     * Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
     */
    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages;

    /**
     * Optional. True, if the bot supports inline queries. Returned only in getMe.
     */
    @JsonProperty("supports_inline_queries")
    private Boolean supportsInlineQueries;

    /**
     * Optional. True, if the bot can be connected to a Telegram Business account to receive its messages. Returned only in getMe.
     */
    @JsonProperty("can_connect_to_business")
    private Boolean canConnectToBusiness;

    /**
     * Optional. True, if the bot has a main Web App. Returned only in {@link GetMe}
     */
    @JsonProperty("has_main_web_app")
    private Boolean hasMainWebApp;
}
