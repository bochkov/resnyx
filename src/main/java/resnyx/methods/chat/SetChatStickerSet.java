package resnyx.methods.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to set a new group sticker set for a supergroup.
 * The bot must be an administrator in the chat for this to work and must have
 * the appropriate admin rights. Use the field can_set_sticker_set optionally
 * returned in getChat requests to check if the bot can use this method.
 * Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SetChatStickerSet extends TgMethod<Boolean> {

    public static final String METHOD = "setChatStickerSet";

    /**
     * Unique identifier for the target chat or
     * username of the target supergroup (in the format @supergroupusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Name of the sticker set to be set as the group sticker set
     */
    @JsonProperty("sticker_set_name")
    private String stickerSet;

    public SetChatStickerSet(String token, Long chatId, String stickerSet) {
        super(token);
        this.chatId = chatId;
        this.stickerSet = stickerSet;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<Boolean>> type() {
        return Types.BOOL;
    }
}
