package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to send point on the map. On success, the sent Message is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendLocation extends ReplyMethod<Message> {

    public static final String METHOD = "sendLocation";

    /**
     * Unique identifier for the target chat or username of the target
     * channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Latitude of the location
     */
    private Float latitude;

    /**
     * Latitude of the location
     */
    private Float longitude;

    /**
     * Period in seconds for which the location will be updated (see {@link LiveLocations},
     * should be between 60 and 86400.
     */
    private Integer livePeriod;

    public SendLocation(String token, Long chatId, Float latitude, Float longitude) {
        super(token);
        this.chatId = chatId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference type() {
        return Types.MESSAGE;
    }
}
