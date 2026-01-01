package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.Place;
import resnyx.common.SendOptions;

/**
 * Use this method to send information about a venue. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendVenue implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which the message will be sent
     */
    @JsonProperty("business_connection_id")
    private String businessConnectionId;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     */
    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Unique identifier for the target message thread (topic) of a forum;
     * for forum supergroups and private chats of bots with forum topic mode enabled only
     */
    @JsonProperty("message_thread_id")
    private Long messageThreadId;

    /**
     * Identifier of the direct messages topic to which the message will be sent;
     * required if the message is sent to a direct messages chat
     */
    @JsonProperty("direct_messages_topic_id")
    private Integer directMessagesTopicId;

    /**
     * Latitude of the venue
     */
    private final Double latitude;

    /**
     * Longitude of the venue
     */
    private final Double longitude;

    /**
     * Name of the venue
     */
    private final String title;

    /**
     * Address of the venue
     */
    private final String address;

    @JsonUnwrapped(prefix = "foursquare_")
    private Place foursquare;

    @JsonUnwrapped(prefix = "google_place_")
    private Place googlePlace;

    @JsonUnwrapped
    private SendOptions sendOptions;
}
