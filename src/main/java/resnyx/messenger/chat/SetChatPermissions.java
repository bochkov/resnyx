package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set default chat permissions for all members.
 * The bot must be an administrator in the group or a supergroup for this to work and must have
 * the can_restrict_members administrator rights. Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetChatPermissions implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * A JSON-serialized object for new default chat permissions
     */
    private final ChatPermissions permissions;

    /**
     * Pass True if chat permissions are set independently.
     * Otherwise, the can_send_other_messages and can_add_web_page_previews permissions will imply the can_send_messages,
     * can_send_audios, can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and can_send_voice_notes permissions;
     * the can_send_polls permission will imply the can_send_messages permission.
     */
    @JsonProperty("use_independent_chat_permissions")
    private Boolean useIndependentChatPermissions;
}
