package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.TgMethod;
import resnyx.Types;

/**
 * Use this method when you need to tell the user that something is happening on the bot's side.
 * The status is set for 5 seconds or less (when a message arrives from your bot,
 * Telegram clients clear its typing status). Returns True on success.
 * <p>
 * Example: The ImageBot needs some time to process a request and upload the image.
 * Instead of sending a text message along the lines of “Retrieving image, please wait…”,
 * the bot may use sendChatAction with action = upload_photo.
 * The user will see a “sending photo” status for the bot.
 * We only recommend using this method when a response from the bot
 * will take a noticeable amount of time to arrive.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendChatAction extends TgMethod<Boolean> {

    public static final String METHOD = "sendChatAction";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Type of action to broadcast. Choose one, depending on what the user is about to receive:
     * typing for text messages, upload_photo for photos, record_video or upload_video for videos,
     * record_audio or upload_audio for audio files, upload_document for general files,
     * find_location for location data, record_video_note or upload_video_note for video notes.
     */
    private ChatAction action;

    public SendChatAction(String token, Long chatId, ChatAction action) {
        super(token);
        this.chatId = chatId;
        this.action = action;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.BOOL;
    }

    public enum ChatAction {

        TYPING("typing"),
        UPLOAD_PHOTO("upload_photo"),
        RECORD_VIDEO("record_video"),
        UPLOAD_VIDEO("upload_video"),
        RECORD_AUDIO("record_audio"),
        UPLOAD_AUDIO("upload_audio"),
        UPLOAD_DOC("upload_document"),
        FIND_LOC("find_location"),
        RECORD_NOTE("record_video_note"),
        UPLOAD_NOTE("upload_video_note");

        String ac;

        ChatAction(String ac) {
            this.ac = ac;
        }

    }
}
