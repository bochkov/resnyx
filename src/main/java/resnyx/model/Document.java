package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a general file (as opposed to photos, voice messages and audio files).
 */
@Data
public final class Document {

    /**
     * Unique file identifier
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Optional. Document thumbnail as defined by sender
     */
    private PhotoSize thumb;

    /**
     * Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String name;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mime;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer size;
}
