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
     * Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    @JsonProperty("big_file_id")
    private String bigId;
}
