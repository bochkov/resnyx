package resnyx.messenger.rich;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Formatted date and time.
 */
@Data
@NoArgsConstructor
public final class RichTextDateTime implements RichText {

    /**
     * Type of the rich text, always “date_time”
     */
    private String type;

    /**
     * The text
     */
    private RichText text;

    /**
     * The Unix time associated with the entity
     */
    @JsonProperty("unix_time")
    private LocalDateTime unixTime;

    /**
     * The string that defines the formatting of the date and time. See date-time entity formatting for more details.
     */
    @JsonProperty("date_time_format")
    private String dateTimeFormat;
}
