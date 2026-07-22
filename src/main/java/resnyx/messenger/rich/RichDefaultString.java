package resnyx.messenger.rich;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public final class RichDefaultString implements RichText {

    /**
     * The text
     */
    private final String text;

}
