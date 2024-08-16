package resnyx.messenger.chat;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The reaction is paid.
 */
@Data
@NoArgsConstructor
public final class ReactionTypePaid implements ReactionType {

    /**
     * Type of the reaction, always “paid”
     */
    private String type;
}
