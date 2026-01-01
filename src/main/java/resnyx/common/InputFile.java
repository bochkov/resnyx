package resnyx.common;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.File;

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
