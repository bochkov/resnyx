package resnyx.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.function.Consumer;

public final class TgObjectMapperConfig implements Consumer<ObjectMapper> {
    @Override
    public void accept(ObjectMapper om) {
        om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        om.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
    }
}
