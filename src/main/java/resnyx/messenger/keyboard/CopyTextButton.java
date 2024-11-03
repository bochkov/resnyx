package resnyx.messenger.keyboard;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This object represents an inline keyboard button that copies specified text to the clipboard.
 */
@Data
@NoArgsConstructor
public final class CopyTextButton {

    /**
     * The text to be copied to the clipboard; 1-256 characters
     */
    private String text;
}
