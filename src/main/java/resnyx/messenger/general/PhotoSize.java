package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 */
@Data
@NoArgsConstructor
public final class PhotoSize {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Photo width
     */
    private Integer width;

    /**
     * Photo height
     */
    private Integer height;
}
