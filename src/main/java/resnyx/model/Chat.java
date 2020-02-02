package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * This object represents a chat.
 */
@Data
@ToString(onlyExplicitlyIncluded = true)
public final class Chat {

    /**
     * Unique identifier for this chat. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    @ToString.Include
    private Long id;

    /**
     * Type of chat, can be either “private”, “group”, “supergroup” or “channel”
     */
    @ToString.Include
    private String type;

    /**
     * Optional. Title, for supergroups, channels and group chats
     */
    @ToString.Include
    private String title;

    /**
     * Optional. Username, for private chats, supergroups and channels if available
     */
    @ToString.Include
    private String username;

    /**
     * Optional. First name of the other party in a private chat
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Optional. Last name of the other party in a private chat
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Optional. True if a group has ‘All Members Are Admins’ enabled.
     * @deprecated
     * @since 4.4
     */
    @Deprecated(since = "4.4")
    @JsonProperty("all_members_are_administrators")
    private Boolean allAdmin;

    /**
     * Optional. Chat photo. Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    private ChatPhoto photo;

    /**
     * Optional. Description, for supergroups and channel chats.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    private String description;

    /**
     * Optional. Chat invite link, for supergroups and channel chats. Each administrator in a
     * chat generates their own invite links, so the bot must first generate
     * the link using <a href="https://core.telegram.org/bots/api#exportchatinvitelink">exportChatInviteLink</a>.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @JsonProperty("invite_link")
    private String inviteLink;

    /**
     * Optional. Pinned message, for groups, supergroups and channels.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @JsonProperty("pinned_message")
    private Message pinnedMsg;

    /**
     * Optional. Default chat member permissions, for groups and supergroups.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @JsonProperty
    private ChatPermissions permissions;

    /**
     * Optional. For supergroups, name of group sticker set.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @JsonProperty("sticker_set_name")
    private String stickerSet;

    /**
     * Optional. True, if the bot can change the group sticker set.
     * Returned only in <a href="https://core.telegram.org/bots/api#getchat">getChat</a>.
     */
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetSticker;
}
