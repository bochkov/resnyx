package resnyx.messenger.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to set a new group sticker set for a supergroup.
 * The bot must be an administrator in the chat for this to work and must have the appropriate administrator rights.
 * Use the field can_set_sticker_set optionally returned in getChat requests to check if the bot can use this method.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SetChatStickerSet implements TgMethod {

    /**
     * Unique identifier for the target group or username of the target supergroup or channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Name of the sticker set to be set as the group sticker set
     */
    @JsonProperty("sticker_set_name")
    private final String stickerSetName;
}
