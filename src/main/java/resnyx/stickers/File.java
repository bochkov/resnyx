package resnyx.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;

/**
 * This object represents a file ready to be downloaded.
 * The file can be downloaded via the link <code>https://api.telegram.org/file/bot&lt;token&gt;/&lt;file_path&gt</code>.
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested by calling getFile.
 * <p>
 * The maximum file size to download is 20 MB
 */
@Data
@NoArgsConstructor
public final class File {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Optional. File path.
     */
    @JsonProperty("file_path")
    private String filePath;

}
