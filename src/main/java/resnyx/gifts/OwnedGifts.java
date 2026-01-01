package resnyx.gifts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Contains the list of gifts received and owned by a user or a chat.
 */
@Data
@NoArgsConstructor
public final class OwnedGifts {

    /**
     * The total number of gifts owned by the user or the chat
     */
    @JsonProperty("total_count")
    private Long totalCount;

    /**
     * The list of gifts
     */
    private List<OwnedGift> gifts;

    /**
     * Optional. Offset for the next request. If empty, then there are no more results
     */
    @JsonProperty("next_offset")
    private String nextOffset;
}
