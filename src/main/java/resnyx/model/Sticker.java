package resnyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * This object represents a sticker.
 */
@Data
public final class Sticker {

    /**
     * Unique identifier for this file
     */
    @JsonProperty("file_id")
    private String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @JsonProperty("file_unique_id")
    private String uniqueId;

    /**
     * Sticker width
     */
    private Integer width;

    /**
     * Sticker height
     */
    private Integer height;

    /**
     * True, if the sticker is animated
     */
    @JsonProperty("is_animated")
    private Boolean isAnimated;

    /**
     * Optional. Sticker thumbnail in the .webp or .jpg format
     */
    private PhotoSize thumb;

    /**
     * Optional. Emoji associated with the sticker
     */
    private String emoji;

    /**
     * Optional. Name of the sticker set to which the sticker belongs
     */
    @JsonProperty("set_name")
    private String setName;

    /**
     * Optional. For mask stickers, the position where the mask should be placed
     */
    @JsonProperty("mask_position")
    private MaskPosition maskPosition;

    /**
     * Optional. File size
     */
    @JsonProperty("file_size")
    private Integer fileSize;
}
