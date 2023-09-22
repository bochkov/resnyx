package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to delete a message, including service messages, with the following limitations:
 * <ul>
 *     <li>A message can only be deleted if it was sent less than 48 hours ago.</li>
 *     <li>Service messages about a supergroup, channel, or forum topic creation can't be deleted.</li>
 *     <li>A dice message in a private chat can only be deleted if it was sent more than 24 hours ago.</li>
 *     <li>Bots can delete outgoing messages in private chats, groups, and supergroups.</li>
 *     <li>Bots can delete incoming messages in private chats.</li>
 *     <li>Bots granted can_post_messages permissions can delete outgoing messages in channels.</li>
 *     <li>If the bot is an administrator of a group, it can delete any message there.</li>
 *     <li>If the bot has can_delete_messages permission in a supergroup or a channel, it can delete any message there.</li>
 * </ul>
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class DeleteMessage implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Identifier of the message to delete
     */
    @JsonProperty("message_id")
    private final Long messageId;

}
