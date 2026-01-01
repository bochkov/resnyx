package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.util.UnixTimeSerializer;
import tools.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

/**
 * Use this method to restrict a user in a supergroup.
 * The bot must be an administrator in the supergroup for this to work and must have the appropriate administrator rights.
 * Pass True for all permissions to lift restrictions from a user.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RestrictChatMember implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * A JSON-serialized object for new user permissions
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

    /**
     * Date when restrictions will be lifted for the user; Unix time.
     * If user is restricted for more than 366 days or less than 30 seconds from the current time, they are considered to be restricted forever
     */
    @JsonSerialize(using = UnixTimeSerializer.class)
    @JsonProperty("until_date")
    private LocalDateTime untilDate;

}
