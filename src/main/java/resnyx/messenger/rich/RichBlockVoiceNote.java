package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.general.Voice;

/**
 * A block with a voice note, corresponding to the HTML tag &lt;audio&gt;.
 */
@Data
@NoArgsConstructor
public final class RichBlockVoiceNote implements RichBlock {

    /**
     * Type of the block, always “voice_note”
     */
    private String type;

    /**
     * The voice note
     */
    @JsonProperty("voice_note")
    private Voice voiceNote;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;
}
