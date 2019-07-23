package resnyx.model;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Sending files
 * There are three ways to send files (photos, stickers, audio, media, etc.):
 * <p>
 * If the file is already stored somewhere on the Telegram servers, you don't need to reupload it: each file object has a file_id field, simply pass this file_id as a parameter instead of uploading. There are no limits for files sent this way.
 * Provide Telegram with an HTTP URL for the file to be sent. Telegram will download and send the file. 5 MB max size for photos and 20 MB max for other types of content.
 * Post the file using multipart/form-data in the usual way that files are uploaded via the browser. 10 MB max size for photos, 50 MB for other files.
 * Sending by file_id
 * <p>
 * It is not possible to change the file type when resending by file_id. I.e. a video can't be sent as a photo, a photo can't be sent as a document, etc.
 * It is not possible to resend thumbnails.
 * Resending a photo by file_id will send all of its sizes.
 * file_id is unique for each individual bot and can't be transferred from one bot to another.
 * Sending by URL
 * <p>
 * When sending by URL the target file must have the correct MIME type (e.g., audio/mpeg for sendAudio, etc.).
 * In sendDocument, sending by URL will currently only work for gif, pdf and zip files.
 * To use sendVoice, the file must have the type audio/ogg and be no more than 1MB in size. 1–20MB voice notes will be sent as files.
 * Other configurations may work but we can't guarantee that they will.
 */
public final class InputFile {

    private final byte[] bytes;
    private final String filename;

    public InputFile(java.io.File file) throws IOException {
        this(
                Files.readAllBytes(file.toPath()),
                file.getName()
        );
    }

    public InputFile(byte[] bytes, String filename) {
        this.bytes = bytes;
        this.filename = filename;
    }

    public byte[] bytes() {
        return bytes;
    }

    public String filename() {
        return filename;
    }
}
