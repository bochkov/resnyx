package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object describes a unique gift that was upgraded from a regular gift.
 */
@Data
@NoArgsConstructor
public final class UniqueGift {

    /**
     * Human-readable name of the regular gift from which this unique gift was upgraded
     */
    @JsonProperty("base_name")
    private String baseName;

    /**
     * Unique name of the gift. This name can be used in https://t.me/nft/... links and story areas
     */
    private String name;

    /**
     * Unique number of the upgraded gift among gifts upgraded from the same regular gift
     */
    private Integer number;

    /**
     * Model of the gift
     */
    private UniqueGiftModel model;

    /**
     * Symbol of the gift
     */
    private UniqueGiftSymbol symbol;

    /**
     * Backdrop of the gift
     */
    private UniqueGiftBackdrop backdrop;

    /**
     * Optional. Information about the chat that published the gift
     */
    @JsonProperty("publisher_chat")
    private Chat publisherChat;
}
