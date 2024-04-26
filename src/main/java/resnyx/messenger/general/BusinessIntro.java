package resnyx.messenger.general;

import lombok.Data;
import lombok.NoArgsConstructor;
import resnyx.stickers.Sticker;

@Data
@NoArgsConstructor
public final class BusinessIntro {

    /**
     * Optional. Title text of the business intro
     */
    private String title;

    /**
     * Optional. Message text of the business intro
     */
    private String message;

    /**
     * Optional. Sticker of the business intro
     */
    private Sticker sticker;
}
