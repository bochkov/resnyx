package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A block with a “Thinking…” placeholder, corresponding to the custom HTML tag &lt;tg-thinking&gt;.
 * The block may be used only in sendRichMessageDraft, therefore it can't be received in messages.
 * See <a href="https://t.me/addemoji/AIActions">https://t.me/addemoji/AIActions</a>
 * for examples of custom emoji that are recommended for usage in the block.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockThinking implements InputRichBlock {

    /**
     * Type of the block, always “thinking”
     */
    private String type;

    /**
     * Text of the block
     */
    private RichText richText;
}
