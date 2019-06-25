package resnyx;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public final class Answer<T> {

    private Boolean ok;

    @JsonProperty("error_code")
    private Integer errorCode;

    private String description;

    private T result;

    public String errDesc() {
        return String.format("%s: %s", errorCode, description);
    }

}
