package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An expandable block for details disclosure, corresponding to the HTML tag &lt;details&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockDetails implements InputRichBlock {

    /**
     * Type of the block, always “details”
     */
    private String type;

    /**
     * Always shown summary of the block
     */
    private RichText summary;

    /**
     * Content of the block
     */
    private List<InputRichBlock> blocks;

    /**
     * Optional. Pass True if the content of the block is visible by default
     */
    @JsonProperty("is_open")
    private Boolean isOpen;
}
