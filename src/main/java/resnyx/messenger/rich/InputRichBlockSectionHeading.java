package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A section heading, corresponding to the HTML tags &lt;h1&gt;, &lt;h2&gt;, &lt;h3&gt;, &lt;h4&gt;, &lt;h5&gt;, or &lt;h6&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockSectionHeading implements InputRichBlock {

    /**
     * Type of the block, always “heading”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText text;

    /**
     * Relative size of the text font; 1-6, 1 is the largest, 6 is the smallest
     */
    private Integer size;
}
