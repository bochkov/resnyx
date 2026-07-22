package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A list of blocks, corresponding to the HTML tag &lt;ul&gt; or &lt;ol&gt; with multiple nested tags &lt;li&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockList implements RichBlock {

    /**
     * Type of the block, always “list”
     */
    private String type;

    /**
     * Items of the list
     */
    private List<RichBlockListItem> text;
}
