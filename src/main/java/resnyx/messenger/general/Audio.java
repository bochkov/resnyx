package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 */
@Data
@NoArgsConstructor
public final class Audio {

    @JsonUnwrapped
    private FileAttr fileAttr;

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
     * Optional. Original filename as defined by sender
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    @JsonProperty("mime_type")
    private String mimeType;

    /**
     * Optional. Thumbnail of the album cover to which the music file belongs
     */
    private PhotoSize thumbnail;

}
