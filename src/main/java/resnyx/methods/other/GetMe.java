package resnyx.methods.other;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import resnyx.Answer;
import resnyx.TgMethod;
import resnyx.Types;
import resnyx.model.User;

/**
 * A simple method for testing your bot's auth token.
 * Requires no parameters.
 * Returns basic information about the bot in form of a {@link User} object.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class GetMe extends TgMethod<User> {

    public static final String METHOD = "getMe";

    public GetMe(String token) {
        super(token);
    }

    @Override
    protected String method() {
        return METHOD;
    }

    @Override
    protected TypeReference<Answer<User>> type() {
        return Types.USER;
    }

}

