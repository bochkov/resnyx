package resnyx;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class TgMethodResult<T> {

    private Boolean ok;

    @JsonProperty("error_code")
    private Integer errorCode;

    private String description;

    private T result;

}
