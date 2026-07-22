package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * An item of a list to be sent.
 */
@Data
@NoArgsConstructor
public class InputRichBlockListItem {

    /**
     * The content of the item
     */
    private List<InputRichBlock> blocks;

    /**
     * Optional. Pass True if the item has a checkbox
     */
    @JsonProperty("has_checkbox")
    private Boolean hasCheckbox;

    /**
     * Optional. Pass True if the item has a checked checkbox
     */
    @JsonProperty("is_checked")
    private Boolean isChecked;

    /**
     * Optional. For ordered lists, the numeric value of the item label
     */
    private Integer value;

    /**
     * Optional.
     * For ordered lists, the type of the item label;
     * must be one of “a” for lowercase letters, “A” for uppercase letters,
     * “i” for lowercase Roman numerals, “I” for uppercase Roman numerals,
     * or “1” for decimal numbers
     */
    private String type;
}
