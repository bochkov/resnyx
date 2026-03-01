package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set a tag for a regular member in a group or a supergroup.
 * The bot must be an administrator in the chat for this to work and must have the can_manage_tags administrator right.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetChatMemberTag implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id")
    private final Long userId;

    /**
     * New tag for the member; 0-16 characters, emoji are not allowed
     */
    private String tag;
}
