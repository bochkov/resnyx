package resnyx.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A preformatted text block, corresponding to the nested HTML tags &lt;pre&gt; and &lt;code&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockPreformatted implements RichBlock {

    /**
     * Type of the block, always “pre”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;

    /**
     * Optional. The programming language of the text
     */
    private String language;
}
