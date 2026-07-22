package resnyx.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;

import java.util.function.Consumer;

public final class TgObjectMapperConfig implements Consumer<JsonMapper.Builder> {
    @Override
    public void accept(JsonMapper.Builder mapperBuilder) {
        mapperBuilder
                .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                .changeDefaultPropertyInclusion(propertyInclusion ->
                        propertyInclusion
                                .withContentInclusion(JsonInclude.Include.NON_NULL)
                                .withValueInclusion(JsonInclude.Include.NON_NULL)
                );
    }
}
