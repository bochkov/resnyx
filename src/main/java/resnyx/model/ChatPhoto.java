package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a chat photo.
 */
@Data
public final class ChatPhoto {

    /**
     * Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download.
     */
    @JsonProperty("small_file_id")
    private String smallId;

    /**
     * Unique file identifier of small (160x160) chat photo, which is supposed
     * to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("small_file_unique_id")
    private String smallUniqueId;

    /**
     * Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    @JsonProperty("big_file_id")
    private String bigId;

    /**
     * Unique file identifier of big (640x640) chat photo, which is supposed
     * to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("big_file_unique_id")
    private String bigUniqueId;
}
