package resnyx.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method to move a sticker in a set created by the bot to a specific position .
 * Returns True on success.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SetStickerPositionInSet extends TgMethod<Boolean> {

    public static final String METHOD = "setStickerPositionInSet";

    /**
     * File identifier of the sticker
     */
    private String sticker;

    /**
     * New sticker position in the set, zero-based
     */
    private Integer position;

    public SetStickerPositionInSet(String token, String sticker, Integer position) {
        super(token);
        this.sticker = sticker;
        this.position = position;
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
