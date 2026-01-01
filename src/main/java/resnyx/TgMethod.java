package resnyx;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.SneakyThrows;
import resnyx.common.InputFile;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public interface TgMethod {

    @JsonIgnore
    default String methodName() {
        TgMethodName declaredMethod = getClass().getAnnotation(TgMethodName.class);
        if (declaredMethod != null && !declaredMethod.value().isEmpty()) {
            return declaredMethod.value();
        } else {
            return getClass().getSimpleName();
        }
    }

    @JsonIgnore
    default boolean hasInputFile() {
        return !inputFileValues().isEmpty();
    }

    @SneakyThrows
    @JsonIgnore
    default Map<String, Object> inputFileValues() {
        Map<String, Object> objects = new LinkedHashMap<>();
        for (Field field : getClass().getDeclaredFields()) {
            if (field.getType() == InputFile.class) {
                field.setAccessible(true);
                InputFile f = (InputFile) field.get(this);
                JsonProperty prop = field.getAnnotation(JsonProperty.class);
                String name = prop == null ? field.getName() : prop.value();
                if (f != null && !(f.value() instanceof String)) {
                    objects.put(name, f.value());
                }
            }
        }
        return objects;
    }

    @JsonIgnore
    default Map<String, Object> toValues(ObjectMapper mapper) {
        Map<String, Object> objects = mapper.convertValue(this, new TypeReference<>() {
        });
        objects.putAll(inputFileValues());
        return objects;
    }

}
