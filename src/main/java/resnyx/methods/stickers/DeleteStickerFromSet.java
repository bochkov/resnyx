package resnyx.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to delete a sticker from a set created by the bot. Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class DeleteStickerFromSet extends TgMethod<Boolean> {

    public static final String METHOD = "deleteStickerFromSet";

    /**
     * File identifier of the sticker
     */
    private String sticker;

    public DeleteStickerFromSet(String token, String sticker) {
        super(token);
        this.sticker = sticker;
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
