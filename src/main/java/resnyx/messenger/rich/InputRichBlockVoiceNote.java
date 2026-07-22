package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMediaVoiceNote;

/**
 * A block with a voice note, corresponding to the HTML tag &lt;audio&gt;.
 */
@Data
@NoArgsConstructor
public final class InputRichBlockVoiceNote implements InputRichBlock {

    /**
     * Type of the block, always “voice_note”
     */
    private String type;

    /**
     * The voice note. Caption is ignored.
     */
    @JsonProperty("voice_note")
    private InputMediaVoiceNote voiceNote;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
