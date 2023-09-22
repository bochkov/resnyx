package resnyx.messenger.general;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.SendOptions;
import resnyx.messenger.inputmedia.InputMedia;

@Getter
@Setter
@RequiredArgsConstructor
public final class SendMediaGroup implements TgMethod {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * A JSON-serialized array describing messages to be sent, must include 2-10 items
     */
    private final List<InputMedia> media;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
