package resnyx.passport;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.common.FileAttr;
import resnyx.util.UnixTimeDeserializer;

/**
 * This object represents a file uploaded to Telegram Passport.
 * Currently all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
 */
@Data
@NoArgsConstructor
public final class PassportFile {

    @JsonUnwrapped
    private FileAttr fileAttr;

    /**
     * Unix time when the file was uploaded
     */
    @JsonDeserialize(using = UnixTimeDeserializer.class)
    @JsonProperty("file_date")
    private LocalDateTime fileDate;
}
