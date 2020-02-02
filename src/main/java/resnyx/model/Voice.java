package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a voice note.
 */
@Data
public final class Voice {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("file_unique_id")
    private String uniqueId;

    /**
     * Duration of the audio in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mime;

    @JsonProperty("file_size")
    private Integer size;
}
