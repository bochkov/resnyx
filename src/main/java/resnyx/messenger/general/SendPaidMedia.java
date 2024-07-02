package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.SendOptions;

import java.util.List;

/**
 * Use this method to send paid media to channel chats. On success, the sent {@link Message} is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendPaidMedia implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * The number of Telegram Stars that must be paid to buy access to the media
     */
    @JsonProperty("star_counter")
    private final Integer starCounter;

    /**
     * A JSON-serialized array describing the media to be sent; up to 10 items
     */
    private final List<InputPaidMedia> media;

    @JsonUnwrapped
    private Caption caption;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
