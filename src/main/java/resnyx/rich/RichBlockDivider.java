package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A divider, corresponding to the HTML tag &lt;hr/&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockDivider implements RichBlock {

    /**
     * Type of the block, always “divider”
     */
    private String type;

}
