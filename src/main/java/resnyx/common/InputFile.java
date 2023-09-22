package resnyx.common;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonValue;

public final class InputFile {

    private final Object file;

    public InputFile(String url) {
        this.file = url;
    }

    public InputFile(File file) {
        this.file = file;
    }

    @JsonValue
    public Object value() {
        return file;
    }

}
