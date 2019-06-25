package resnyx;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class ReplyMethod<T> extends TgMethod<T> {

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in your bot's message.
     */
    @JsonProperty("parse_mode")
    private String parseMode;

    /**
     * Optional. Disables link previews for links in this message
     */
    @JsonProperty("disable_web_page_preview")
    private Boolean disablePreview;

    /**
     * Optional. Sends the message <a href="https://telegram.org/blog/channels-2-0#silent-messages">silently</a>.
     * Users will receive a notification with no sound.
     */
    @JsonProperty("disable_notification")
    private Boolean disableNotification;

    /**
     * Optional. If the message is a reply, ID of the original message
     */
    @JsonProperty("reply_to_message_id")
    private Integer replyTo;

    /**
     * Optional. Additional interface options. A JSON-serialized object for
     * an <a href="https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating">inline keyboard</a>,
     * <a href="https://core.telegram.org/bots#keyboards">custom reply keyboard</a>,
     * instructions to remove reply keyboard or to force a reply from the user.
     * <p>
     * Can be:
     * <ul>
     * <li>{@link resnyx.model.InlineKeyboardMarkup}</li>
     * <li>{@link resnyx.model.ReplyKeyboardMarkup}</li>
     * <li>{@link resnyx.model.ReplyKeyboardRemove}</li>
     * <li>{@link resnyx.model.ForceReply}</li>
     * </ul>
     */
    @JsonProperty("reply_markup")
    private Serializable replyMarkup;

    public ReplyMethod(String token) {
        super(token);
    }
}
