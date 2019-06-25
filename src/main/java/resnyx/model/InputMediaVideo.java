package resnyx.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Represents a video to be sent.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public final class InputMediaVideo extends InputMedia {

    /**
     * Optional. Thumbnail of the file sent; can be ignored if thumbnail generation
     * for the file is supported server-side. The thumbnail should be in JPEG format
     * and less than 200 kB in size. A thumbnail‘s width and height should not exceed 320.
     * Ignored if the file is not uploaded using multipart/form-data. Thumbnails can’t be
     * reused and can be only uploaded as a new file, so you can pass
     * “attach://<file_attach_name>” if the thumbnail was uploaded using multipart/form-data
     * under <file_attach_name>
     */
    private InputFile thumb;

    /**
     * Optional. Video width
     */
    private Integer width;

    /**
     * Optional. Video height
     */
    private Integer height;

    /**
     * Optional. Video duration
     */
    private Integer duration;

    /**
     * Optional. Pass True, if the uploaded video is suitable for streaming
     */
    @JsonProperty("supports_streaming")
    private Boolean streaming;

    public InputMediaVideo() {
        this.type = "video";
    }
}
