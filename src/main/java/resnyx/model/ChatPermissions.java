package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat
 */
@Data
public final class ChatPermissions {

    /**
     * Optional. True, if the user is allowed to send text messages, contacts, locations and venues
     */
    @JsonProperty("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Optional. True, if the user is allowed to send audios, documents, photos, videos,
     * video notes and voice notes, implies can_send_messages
     */
    @JsonProperty("can_send_media_messages")
    private Boolean canSendMedia;

    /**
     * Optional. True, if the user is allowed to send polls, implies can_send_messages
     */
    @JsonProperty("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots,
     * implies can_send_media_messages
     */
    @JsonProperty("can_send_other_messages")
    private Boolean canSendOther;

    /**
     * Optional. True, if the user is allowed to add web page previews to their messages,
     * implies can_send_media_messages
     */
    @JsonProperty("can_add_web_page_previews")
    private Boolean canAddWebPreview;

    /**
     * Optional. True, if the user is allowed to change the chat title, photo and other settings.
     * Ignored in public supergroups
     */
    @JsonProperty("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Optional. True, if the user is allowed to invite new users to the chat
     */
    @JsonProperty("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
     */
    @JsonProperty("can_pin_messages")
    private Boolean canPinMessages;
}
