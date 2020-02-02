package resnyx.methods.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.ReplyMethod;
import resnyx.Types;
import resnyx.model.Message;

/**
 * Use this method to send information about a venue. On success, the sent Message is returned.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class SendVenue extends ReplyMethod<Message> {

    public static final String METHOD = "sendVenue";

    /**
     * Unique identifier for the target chat or username of
     * the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private Long chatId;

    /**
     * Latitude of the venue
     */
    private Float latitude;

    /**
     * Longitude of the venue
     */
    private Float longitude;

    /**
     * Name of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    private String fid;

    /**
     * Optional. Foursquare type of the venue, if known.
     * (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    private String ftype;

    public SendVenue(String token, Long chatId, Float lat, Float lon, String title, String address) {
        super(token);
        this.chatId = chatId;
        this.latitude = lat;
        this.longitude = lon;
        this.title = title;
        this.address = address;
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<Message>> type() {
        return Types.MESSAGE;
    }
}
