package resnyx.messenger.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;

/**
 * Reposts a story on behalf of a business account from another business account.
 * Both business accounts must be managed by the same bot, and the story on the source account
 * must have been posted (or reposted) by the bot.
 * Requires the can_manage_stories business bot right for both business accounts.
 * Returns {@link Story} on success.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class RepostStory implements TgMethod {

    /**
     * Unique identifier of the business connection on behalf of which to read the message
     */
    @JsonProperty("business_connection_id")
    private final String businessConnectionId;

    /**
     * Unique identifier of the chat which posted the story that should be reposted
     */
    @JsonProperty("from_chat_id")
    private final Long fromChatId;

    /**
     * Unique identifier of the story that should be reposted
     */
    @JsonProperty("from_story_id")
    private final Long fromStoryId;

    /**
     * Period after which the story is moved to the archive, in seconds;
     * must be one of 6 * 3600, 12 * 3600, 86400, or 2 * 86400
     */
    @JsonProperty("active_period")
    private final Integer activePeriod;

    /**
     * Pass True to keep the story accessible after it expires
     */
    @JsonProperty("post_to_chat_page")
    private Boolean postToChatPage;

    /**
     * Pass True if the content of the story must be protected from forwarding and screenshotting
     */
    @JsonProperty("protect_content")
    private Boolean protectContent;

}
