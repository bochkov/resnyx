package resnyx.stickers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method to get information about custom emoji stickers by their identifiers.
 * Returns an Array of Sticker objects.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class GetCustomEmojiStickers implements TgMethod {

    /**
     * List of custom emoji identifiers. At most 200 custom emoji identifiers can be specified.
     */
    @JsonProperty("custom_emoji_ids")
    private final List<String> customEmojiIds;

}
