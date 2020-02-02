package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.InputMedia;
import resnyx.model.InputMediaPhoto;
import resnyx.model.InputMediaVideo;
import resnyx.model.Message;

import java.util.List;

/**
 * Use this method to send a group of photos or videos as an album.
 * On success, an array of the sent Messages is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendMediaGroup extends ReplyMethod<List<Message>> {

    public static final String METHOD = "sendMediaGroup";

    /**
     * Unique identifier for the target chat or username of the
     * target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * A JSON-serialized array describing photos and videos to be sent, must include 2–10 items.
     * Array of {@link InputMediaPhoto} and {@link InputMediaVideo}
     */
    private List<InputMedia> media;

    public SendMediaGroup(String token, Long chatId, List<InputMedia> media) {
        super(token);
        this.chatId = chatId;
        this.media = media;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<List<Message>>> type() {
        return Types.ARR_OF_MESSAGES;
    }
}
