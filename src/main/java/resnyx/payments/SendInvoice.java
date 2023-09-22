package resnyx.payments;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import resnyx.TgMethod;
import resnyx.common.SendOptions;

/**
 * Use this method to send invoices. On success, the sent Message is returned.
 */
@Getter
@Setter
@RequiredArgsConstructor
public final class SendInvoice implements TgMethod {

    @JsonProperty("chat_id")
    private final String chatId;

    /**
     * Product name, 1-32 characters
     */
    private final String title;

    /**
     * Product description, 1-255 characters
     */
    private final String description;

    /**
     * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your internal processes.
     */
    private final String payload;

    /**
     * Payment provider token, obtained via @BotFather
     */
    @JsonProperty("provider_token")
    private final String providerToken;

    /**
     * Three-letter ISO 4217 currency code
     */
    private final String currency;

    /**
     * Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.)
     */
    private final List<LabeledPrice> prices;

    /**
     * The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double).
     * For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     * Defaults to 0
     */
    @JsonProperty("max_tip_amount")
    private Integer maxTipAmount;

    /**
     * A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double).
     * At most 4 suggested tip amounts can be specified. The suggested tip amounts must be positive,
     * passed in a strictly increased order and must not exceed max_tip_amount.
     */
    @JsonProperty("suggested_tip_amounts")
    private List<Integer> suggestedTipAmounts;

    /**
     * Unique deep-linking parameter. If left empty, forwarded copies of the sent message will have a Pay button,
     * allowing multiple users to pay directly from the forwarded message, using the same invoice.
     * If non-empty, forwarded copies of the sent message will have a URL button with a deep link to the bot
     * (instead of a Pay button), with the value used as the start parameter
     */
    @JsonProperty("start_parameter")
    private String startParameter;

    /**
     * JSON-serialized data about the invoice, which will be shared with the payment provider.
     * A detailed description of required fields should be provided by the payment provider.
     */
    @JsonProperty("provider_data")
    private String providerData;

    /**
     * URL of the product photo for the invoice.
     * Can be a photo of the goods or a marketing image for a service.
     * People like it better when they see what they are paying for.
     */
    @JsonProperty("photo_url")
    private String photoUrl;

    /**
     * Photo size in bytes
     */
    @JsonProperty("photo_size")
    private Integer photoSize;

    /**
     * Photo width
     */
    @JsonProperty("photo_width")
    private Integer photoWidth;

    /**
     * Photo height
     */
    @JsonProperty("photo_height")
    private Integer photoHeight;

    /**
     * Pass True if you require the user's full name to complete the order
     */
    @JsonProperty("need_name")
    private Boolean needName;

    /**
     * Pass True if you require the user's phone number to complete the order
     */
    @JsonProperty("need_phone_number")
    private Boolean needPhoneNumber;

    /**
     * Pass True if you require the user's email address to complete the order
     */
    @JsonProperty("need_email")
    private Boolean needEmail;

    /**
     * Pass True if you require the user's shipping address to complete the order
     */
    @JsonProperty("need_shipping_address")
    private Boolean needShippingAddress;

    /**
     * Pass True if the user's phone number should be sent to provider
     */
    @JsonProperty("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider;

    /**
     * Pass True if the user's email address should be sent to provider
     */
    @JsonProperty("send_email_to_provider")
    private Boolean sendEmailToProvider;

    /**
     * Pass True if the final price depends on the shipping method
     */
    @JsonProperty("is_flexible")
    private Boolean isFlexible;

    @JsonUnwrapped
    private SendOptions sendOptions;

}
