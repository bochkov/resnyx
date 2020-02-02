package resnyx.methods.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.File;

/**
 * Use this method to get basic info about a file and prepare it for downloading.
 * For the moment, bots can download files of up to 20MB in size.
 * On success, a File object is returned.
 * The file can then be downloaded via the link https://api.telegram.org/file/bot<token>/<file_path>,
 * where <file_path> is taken from the response.
 * It is guaranteed that the link will be valid for at least 1 hour.
 * When the link expires, a new one can be requested by calling getFile again.
 * <p>
 * Note: This function may not preserve the original file name and MIME type.
 * You should save the file's MIME type and name (if available) when the File object is received.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetFile extends TgMethod<File> {

    public static final String METHOD = "getFile";

    /**
     * File identifier to get info about
     */
    @JsonProperty("file_id")
    public String fileId;

    public GetFile(String token, String fileId) {
        super(token);
        this.fileId = fileId;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<File>> type() {
        return Types.FILE;
    }
}
