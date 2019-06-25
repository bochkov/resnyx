package resnyx.methods.stickers;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.StickerSet;

/**
 * Use this method to get a sticker set. On success, a StickerSet object is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetStickerSet extends TgMethod<StickerSet> {

    public static final String METHOD = "getStickerSet";

    /**
     * Name of the sticker set
     */
    private String name;

    public GetStickerSet(String token, String name) {
        super(token);
        this.name = name;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.STICKERS;
    }
}
