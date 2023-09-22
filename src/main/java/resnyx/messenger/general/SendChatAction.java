package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Use this method when you need to tell the user that something is happening on the bot's side.
 * The status is set for 5 seconds or less (when a message arrives from your bot,
 * Telegram clients clear its typing status). Returns True on success.
 * <p>
 * Example: The ImageBot needs some time to process a request and upload the image.
 * Instead of sending a text message along the lines of “Retrieving image, please wait…”,
 * the bot may use sendChatAction with action = upload_photo.
 * The user will see a “sending photo” status for the bot.
 * <p>
 * We only recommend using this method when a response from the bot will take a noticeable amount of time to arrive.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendChatAction implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread; supergroups only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Type of action to broadcast.
     */
    private ActionType action;
}
