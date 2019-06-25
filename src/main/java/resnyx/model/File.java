package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via the link <code>https://api.telegram.org/file/bot<token>/<file_path></code>.
 * It is guaranteed that the link will be valid for at least 1 hour.
 * When the link expires, a new one can be requested by calling
 * <a href="https://core.telegram.org/bots/api#getfile">getFile</a>.
 * <br>
 * Maximum file size to download is 20 MB
 */
@Data
public final class File {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String id;

    /**
     * Optional. File size, if known
     */
    @JsonProperty("file_size")
    private Integer size;

    /**
     * Optional. File path.
     * Use <code>https://api.telegram.org/file/bot<token>/<file_path></code> to get the file.
     */
    @JsonProperty("file_path")
    private String path;
}
