package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * This object contains information about one member of a chat.
 */
@Data
public final class ChatMember {

    /**
     * Information about the user
     */
    private User user;

    /**
     * The member's status in the chat. Can be “creator”, “administrator”, “member”, “restricted”, “left” or “kicked”
     */
    private String status;

    /**
     * Optional. Restricted and kicked only. Date when restrictions will be lifted for this user, unix time
     */
    @JsonProperty("until_date")
    private Date until;

    /**
     * Optional. Administrators only. True, if the bot is allowed to edit administrator privileges of that user
     */
    @JsonProperty("can_be_edited")
    private Boolean canBeEdited;

    /**
     * Optional. Administrators and restricted only. True, if the user is allowed to change the chat title, photo and other settings
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Optional. Administrators only. True, if the administrator can post in the channel, channels only
     */
    @JsonProperty("can_post_messages")
    private Boolean canPostMessages;

    /**
     * Optional. Administrators only. True, if the administrator can edit messages of other users and
     * can pin messages, channels only
     */
    @JsonProperty("can_edit_messages")
    private Boolean canEditMessages;

    /**
     * Optional. Administrators only. True, if the administrator can delete messages of other users
     */
    @JsonProperty("can_delete_messages")
    private Boolean canDeleteMessages;

    /**
     * Optional. Administrators and restricted only. True, if the user is allowed to invite new users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Optional. Administrators only. True, if the administrator can restrict, ban or unban chat members
     */
    @JsonProperty("can_restrict_members")
    private Boolean canRestrictMembers;

    /**
     * Optional. Administrators and restricted only. True, if the user is allowed to pin messages; groups and supergroups only
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * Optional. Administrators only. True, if the administrator can add new administrators with a
     * subset of his own privileges or demote administrators that he has promoted, directly or indirectly
     * (promoted by administrators that were appointed by the user)
     */
    @JsonProperty("can_promote_members")
    private Boolean canPromoteMembers;

    /**
     * Optional. Restricted only. True, if the user is a member of the chat at the moment of the request
     */
    @JsonProperty("is_member")
    private Boolean isMember;

    /**
     * Optional. Restricted only. True, if the user can send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Optional. Restricted only. True, if the user can send audios, documents, photos,
     * videos, video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMedia;

    /**
     * Optional. Restricted only. True, if the user is allowed to send polls
     */
    @JsonProperty("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Optional. Restricted only. True, if the user can send animations, games,
     * stickers and use inline bots, implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOther;

    /**
     * Optional. Restricted only. True, if user may add web page previews to his messages,
     * implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPreview;
}
