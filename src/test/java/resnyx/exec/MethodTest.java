package resnyx.exec;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import kong.unirest.core.ContentType;
import kong.unirest.core.HttpRequestWithBody;
import kong.unirest.core.Unirest;
import kong.unirest.jackson.JacksonObjectMapper;
import lombok.extern.slf4j.Slf4j;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;
import resnyx.util.TgObjectMapperConfig;
import resnyx.messenger.general.GetMe;
import resnyx.messenger.general.SendDocument;

@Slf4j
class MethodTest {

    private static final String USER_CHAT_ID_KEY = "user.chat.id";
    private static final String GROUP_CHAT_ID_KEY = "group.chat.id";
    private static final String BOT_TOKEN_KEY = "bot.token";

    private static String userChatId;
    private static String groupChatId;
    private static String botToken;

    public static String send(TgMethod method) throws IOException {
        setUp();
        JacksonObjectMapper om = new JacksonObjectMapper(new TgObjectMapperConfig());
        Unirest.config().setObjectMapper(om);

        LOG.info("method = '{}', req = {}", method.methodName(), om.writeValue(method));
        HttpRequestWithBody req = Unirest.post(String.format("https://api.telegram.org/bot%s/%s", botToken, method.methodName()));
        if (method.hasInputFile()) {
            Map<String, Object> fields = method.toValues(om.getJacksonMapper());
            return req.contentType(ContentType.MULTIPART_FORM_DATA.getMimeType())
                    .accept(ContentType.APPLICATION_JSON.getMimeType())
                    .fields(fields)
                    .asString()
                    .getBody();
        } else {
            return req.contentType(ContentType.APPLICATION_JSON.getMimeType())
                    .body(method)
                    .asString()
                    .getBody();
        }
    }

    public static <T> T send(TgMethod method, Class<T> clz) throws IOException {
        String result = send(method);
        return Unirest.config().getObjectMapper().readValue(result, clz);
    }

    public static void setUp() throws IOException {
        Properties props = new Properties();
        try (FileReader reader = new FileReader("tg.properties")) {
            props.load(reader);
        }
        userChatId = props.getProperty(USER_CHAT_ID_KEY);
        groupChatId = props.getProperty(GROUP_CHAT_ID_KEY);
        botToken = props.getProperty(BOT_TOKEN_KEY);
    }

    public static void sendSimple() throws Exception {
        send(new GetMe());
    }

    public static void sendMultipart() throws Exception {
        SendDocument method = new SendDocument(userChatId, new InputFile(new File("942707.torrent")));
        method.setCaption(new Caption("Barbie"));
        method.setDisableContentTypeDetection(true);
        SendOptions opts = new SendOptions();
        opts.setProtectContent(true);
        send(method);
    }

}
