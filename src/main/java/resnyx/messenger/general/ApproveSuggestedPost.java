package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.util.UnixTimeSerializer;
import tools.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

/**
 * Use this method to approve a suggested post in a direct messages chat.
 * The bot must have the 'can_post_messages' administrator right in the corresponding channel chat.
 * Returns True on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class ApproveSuggestedPost implements TgMethod {

    /**
     * Unique identifier for the target direct messages chat
     */
    @JsonProperty("chat_id")
    private final Long chatId;

    /**
     * Identifier of a suggested post message to approve
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * Point in time (Unix timestamp) when the post is expected to be published;
     * omit if the date has already been specified when the suggested post was created.
     * If specified, then the date must be not more than 2678400 seconds (30 days) in the future
     */
    @JsonProperty("send_date")
    @JsonSerialize(using = UnixTimeSerializer.class)
    private LocalDate sendDate;
}
