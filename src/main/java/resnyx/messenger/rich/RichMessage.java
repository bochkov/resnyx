package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Rich formatted message.
 */
@Data
@NoArgsConstructor
public final class RichMessage {

    /**
     * Content of the message
     */
    private List<RichBlock> blocks;

    /**
     * Optional. True, if the rich message must be shown right-to-left
     */
    @JsonProperty("is_rtl")
    private Boolean isRightToLeft;
}
