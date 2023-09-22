package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get basic information about a file and prepare it for downloading.
 * For the moment, bots can download files of up to 20MB in size. On success, a File object is returned.
 * The file can then be downloaded via the link https://api.telegram.org/file/bot&lt;token&gt;/&lt;file_path&gt;,
 * where &lt;file_path&gt; is taken from the response.
 * It is guaranteed that the link will be valid for at least 1 hour.
 * When the link expires, a new one can be requested by calling getFile again.
 * <p>
 * Note: This function may not preserve the original file name and MIME type.
 * You should save the file's MIME type and name (if available) when the File object is received.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetFile implements TgMethod {

    /**
     * File identifier to get information about
     */
    @JsonProperty("file_id")
    private final String fileId;
}
