package resnyx.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Cell in a table.
 */
@Data
@NoArgsConstructor
public final class RichBlockTableCell implements RichBlock {

    /**
     * Optional. Text in the cell. If omitted, then the cell is invisible.
     */
    private RichText text;

    /**
     * Optional. True, if the cell is a header cell
     */
    @JsonProperty("is_header")
    private Boolean isHeader;

    /**
     * Optional. The number of columns the cell spans if it is bigger than 1
     */
    @JsonProperty("colspan")
    private Integer colSpan;

    /**
     * Optional. The number of rows the cell spans if it is bigger than 1
     */
    @JsonProperty("rowspan")
    private Integer rowSpan;

    /**
     * Horizontal cell content alignment. Currently, must be one of “left”, “center”, or “right”.
     */
    private String align;

    /**
     * Vertical cell content alignment. Currently, must be one of “top”, “middle”, or “bottom”.
     */
    private String valign;
}
