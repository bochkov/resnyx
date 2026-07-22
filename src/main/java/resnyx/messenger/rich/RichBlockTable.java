package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * A table, corresponding to the HTML tag &lt;table&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockTable implements RichBlock {

    /**
     * Type of the block, always “table”
     */
    private String type;

    /**
     * Cells of the table
     */
    private List<List<RichBlockTableCell>> cells;

    /**
     * Optional. True, if the table has borders
     */
    @JsonProperty("is_bordered")
    private Boolean isBordered;

    /**
     * Optional. True, if the table is striped
     */
    @JsonProperty("is_stripped")
    private Boolean isStripped;

    /**
     * Optional. Caption of the table
     */
    private RichText caption;

}
