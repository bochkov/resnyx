package resnyx.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Represents a general file to be sent.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class InputMediaDocument extends InputMedia {

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation for the file
     * is supported server-side. The thumbnail should be in JPEG format and less than 200 kB in size.
     * A thumbnail‘s width and height should not exceed 320. Ignored if the file is not uploaded
     * using multipart/form-data. Thumbnails can’t be reused and can be only uploaded as a new file,
     * so you can pass “attach://<file_attach_name>” if the thumbnail was uploaded using
     * multipart/form-data under <file_attach_name>
     */
    private InputFile thumb;

    public InputMediaDocument() {
        this.type = "document";
    }
}
