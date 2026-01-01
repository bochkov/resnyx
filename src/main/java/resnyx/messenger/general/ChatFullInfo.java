package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.chat.ChatLocation;
import resnyx.messenger.chat.ChatPermissions;
import resnyx.messenger.chat.ChatPhoto;
import resnyx.messenger.chat.ReactionType;
import resnyx.util.UnixTimeDeserializer;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

/**
 * This object contains full information about a chat.
 */
@Data
@NoArgsConstructor
public final class ChatFullInfo {

    /**
     * Unique identifier for this chat.
     * This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
     */
    private Long id;

    /**
     * Type of chat
     */
    private ChatType type;

    /**
     * Optional. Title, for supergroups, channels and group chats
     */
    private String title;

    /**
     * Optional. Username, for private chats, supergroups and channels if available
     */
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
     * Optional. True, if the supergroup chat is a forum (has topics enabled)
     */
    @JsonProperty("is_forum")
    private Boolean isForum;

    /**
     * Optional. True, if the chat is the direct messages chat of a channel
     */
    @JsonProperty("is_direct_messages")
    private Boolean isDirectMessages;

    /**
     * Optional. Identifier of the accent color for the chat name and backgrounds of the chat photo, reply header,
     * and link preview. See accent colors for more details. Returned only in getChat. Always returned in getChat.
     */
    @JsonProperty("accent_color_id")
    private Integer accentColorId;

    /**
     * The maximum number of reactions that can be set on a message in the chat
     */
    @JsonProperty("max_reaction_count")
    private Integer maxReactionCount;

    /**
     * Optional. Chat photo. Returned only in getChat.
     */
    private ChatPhoto photo;

    /**
     * Optional. If non-empty, the list of all active chat usernames;
     * for private chats, supergroups and channels. Returned only in getChat.
     */
    @JsonProperty("active_usernames")
    private List<String> activeUsernames;

    /**
     * Optional. For private chats, the date of birth of the user. Returned only in getChat.
     */
    private Birthdate birthdate;

    /**
     * Optional. For private chats with business accounts, the intro of the business. Returned only in getChat.
     */
    @JsonProperty("business_intro")
    private BusinessIntro businessIntro;

    /**
     * Optional. For private chats with business accounts, the location of the business. Returned only in getChat.
     */
    @JsonProperty("business_location")
    private BusinessLocation businessLocation;

    /**
     * Optional. For private chats with business accounts, the opening hours of the business. Returned only in getChat.
     */
    @JsonProperty("business_opening_hours")
    private BusinessOpeningHours businessOpeningHours;

    /**
     * Optional. For private chats, the personal channel of the user. Returned only in getChat.
     */
    @JsonProperty("personal_chat")
    private Chat personalChat;

    /**
     * Optional. Information about the corresponding channel chat; for direct messages chats only
     */
    @JsonProperty("parent_chat")
    private Chat parentChat;

    /**
     * Optional. List of available reactions allowed in the chat.
     * If omitted, then all emoji reactions are allowed.
     * Returned only in getChat.
     */
    @JsonProperty("available_reactions")
    private List<ReactionType> availableReactions;

    /**
     * Optional. Custom emoji identifier of emoji chosen by the chat for the reply header and link preview background.
     * Returned only in getChat.
     */
    @JsonProperty("background_custom_emoji_id")
    private String backgroundCustomEmojiId;

    /**
     * Optional. Identifier of the accent color for the chat's profile background.
     * See profile accent colors for more details. Returned only in getChat.
     */
    @JsonProperty("profile_accent_color_id")
    private Integer profileAccentColorId;

    /**
     * Optional. Custom emoji identifier of the emoji chosen by the chat for its profile background.
     * Returned only in getChat.
     */
    @JsonProperty("profile_background_custom_emoji_id")
    private String profileBackgroundCustomEmojiId;

    /**
     * Optional. Custom emoji identifier of emoji status of the other party in a private chat. Returned only in getChat.
     */
    @JsonProperty("emoji_status_custom_emoji_id")
    private String emojiStatusCustomEmojiId;

    /**
     * Optional. Expiration date of the emoji status of the other party in a private chat in Unix time, if any.
     * Returned only in getChat.
     */
    @JsonProperty("emoji_status_expiration_date")
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    private LocalDateTime emojiStatusExpirationDate;

    /**
     * Optional. Bio of the other party in a private chat. Returned only in getChat.
     */
    private String bio;

    /**
     * Optional. True, if privacy settings of the other party in the private chat allows to use
     * <code>tg://user?id=&lt;user_id&gt;</code> links only in chats with the user. Returned only in getChat.
     */
    @JsonProperty("has_private_forwards")
    private Boolean hasPrivateForwards;

    /**
     * Optional. True, if the privacy settings of the other party restrict sending voice and video note messages in the private chat. Returned only in getChat.
     */
    @JsonProperty("has_restricted_voice_and_video_messages")
    private Boolean hasRestrictedVoiceAndVideoMessages;

    /**
     * Optional. True, if users need to join the supergroup before they can send messages. Returned only in getChat.
     */
    @JsonProperty("join_to_send_messages")
    private Boolean joinToSendMessages;

    /**
     * Optional. True, if all users directly joining the supergroup need to be approved by supergroup administrators. Returned only in getChat.
     */
    @JsonProperty("join_by_request")
    private Boolean joinByRequest;

    /**
     * Optional. Description, for groups, supergroups and channel chats. Returned only in getChat.
     */
    private String description;
    /**
     * Optional. Primary invite link, for groups, supergroups and channel chats. Returned only in getChat.
     */
    @JsonProperty("invite_link")
    private String inviteLink;

    /**
     * Optional. The most recent pinned message (by sending date). Returned only in getChat.
     */
    @JsonProperty("pinned_message")
    private Message pinnedMessage;

    /**
     * Optional. Default chat member permissions, for groups and supergroups. Returned only in getChat.
     */
    private ChatPermissions permissions;

    /**
     * Information about types of gifts that are accepted by the chat or by the corresponding user for private chats
     */
    @JsonProperty("accepted_gift_types")
    private AcceptedGiftTypes acceptedGiftTypes;

    /**
     * Optional. True, if paid media messages can be sent or forwarded to the channel chat. The field is available only for channel chats.
     */
    @JsonProperty("can_send_paid_media")
    private Boolean canSendPaidMedia;

    /**
     * Optional. For supergroups, the minimum allowed delay between consecutive messages sent
     * by each unpriviledged user; in seconds. Returned only in getChat.
     */
    @JsonProperty("slow_mode_delay")
    private Integer slowModeDelay;

    /**
     * Optional. For supergroups, the minimum number of boosts that a non-administrator user needs to add
     * in order to ignore slow mode and chat permissions. Returned only in getChat.
     */
    @JsonProperty("unrestrict_boost_count")
    private Integer unrestrictBoostCount;

    /**
     * Optional. The time after which all messages sent to the chat will be automatically deleted; in seconds.
     * Returned only in getChat.
     */
    @JsonProperty("message_auto_delete_time")
    private Integer messageAutoDeleteTime;

    /**
     * Optional. True, if aggressive anti-spam checks are enabled in the supergroup.
     * The field is only available to chat administrators. Returned only in getChat.
     */
    @JsonProperty("has_aggressive_anti_spam_enabled")
    private Boolean hasAggressiveAntiSpamEnabled;

    /**
     * Optional. True, if non-administrators can only get the list of bots and administrators in the chat.
     * Returned only in getChat.
     */
    @JsonProperty("has_hidden_members")
    private Boolean hasHiddenMembers;

    /**
     * Optional. True, if messages from the chat can't be forwarded to other chats. Returned only in getChat.
     */
    @JsonProperty("has_protected_content")
    private Boolean hasProtectedContent;

    /**
     * Optional. True, if new chat members will have access to old messages; available only to chat administrators. Returned only in getChat.
     */
    @JsonProperty("has_visible_history")
    private Boolean hasVisibleHistory;

    /**
     * Optional. For supergroups, name of group sticker set. Returned only in getChat.
     */
    @JsonProperty("sticker_set_name")
    private String stickerSetName;

    /**
     * Optional. True, if the bot can change the group sticker set. Returned only in getChat.
     */
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerName;

    /**
     * Optional. For supergroups, the name of the group's custom emoji sticker set.
     * Custom emoji from this set can be used by all users and bots in the group.
     * Returned only in getChat.
     */
    @JsonProperty("custom_emoji_sticker_set_name ")
    private String customEmojiStickerSetName;

    /**
     * Optional. Unique identifier for the linked chat, i.e. the discussion group identifier for a channel and vice versa; for supergroups and channel chats.
     * This identifier may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier. Returned only in getChat.
     */
    @JsonProperty("linked_chat_id")
    private Long linkedChatId;

    /**
     * Optional. For supergroups, the location to which the supergroup is connected. Returned only in getChat.
     */
    private ChatLocation location;
}
