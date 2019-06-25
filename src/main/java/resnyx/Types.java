package resnyx;

import com.fasterxml.jackson.core.type.TypeReference;
import resnyx.model.*;

import java.util.List;

public final class Types {

    public static final TypeReference<Answer<String>> STR = new TypeReference<>() {
    };
    public static final TypeReference<Answer<Boolean>> BOOL = new TypeReference<>() {
    };
    public static final TypeReference<Answer<Integer>> INT = new TypeReference<>() {
    };
    public static final TypeReference<Answer<User>> USER = new TypeReference<>() {
    };
    public static final TypeReference<Answer<Message>> MESSAGE = new TypeReference<>() {
    };
    public static final TypeReference<Answer<List<Message>>> ARR_OF_MESSAGES = new TypeReference<>() {
    };
    public static final TypeReference<Answer<UserProfilePhotos>> USER_PHOTOS = new TypeReference<>() {
    };
    public static final TypeReference<Answer<File>> FILE = new TypeReference<>() {
    };
    public static final TypeReference<Answer<Chat>> CHAT = new TypeReference<>() {
    };
    public static final TypeReference<Answer<ChatMember>> CHAT_MEMBER = new TypeReference<>() {
    };
    public static final TypeReference<Answer<List<ChatMember>>> CHAT_MEMBERS = new TypeReference<>() {
    };
    public static final TypeReference<Answer<Poll>> POLL = new TypeReference<>() {
    };
    public static final TypeReference<Answer<StickerSet>> STICKERS = new TypeReference<>() {
    };

    private Types() {

    }
}
