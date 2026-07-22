package resnyx.messenger.rich;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.messenger.inputmedia.InputMedia;

/**
 * Describes a media element embedded in an outgoing rich message.
 */
@Data
@NoArgsConstructor
public class InputRichMessageMedia {

    /**
     * Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link.
     * 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     */
    private String id;

    /**
     * The media to be sent. Everything except the media itself and its properties is ignored.
     * InputMediaAnimation or InputMediaAudio or InputMediaPhoto or InputMediaVideo or InputMediaVoiceNote
     */
    private InputMedia media;
}
