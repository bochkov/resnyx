package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 */
@Data
public final class Audio {

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
     * Optional. Performer of the audio as defined by sender or by audio tags
     */
    private String performer;

    /**
     * Optional. Title of the audio as defined by sender or by audio tags
     */
    private String title;

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

    /**
     * Optional. Thumbnail of the album cover to which the music file belongs
     */
    private PhotoSize thumb;
}
