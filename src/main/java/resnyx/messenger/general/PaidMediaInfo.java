package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Describes the paid media added to a message.
 */
@Data
@NoArgsConstructor
public final class PaidMediaInfo {

    /**
     * The number of Telegram Stars that must be paid to buy access to the media
     */
    @JsonProperty("star_counter")
    private Integer starCounter;

    /**
     * Information about the paid media
     */
    @JsonProperty("paid_media")
    private List<PaidMedia> paidMedia;
}
