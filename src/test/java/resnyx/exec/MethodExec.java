package resnyx.exec;

import kong.unirest.core.ContentType;
import kong.unirest.core.HttpRequestWithBody;
import kong.unirest.core.Unirest;
import kong.unirest.modules.jackson.JacksonObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import resnyx.TgMethod;
import resnyx.common.Caption;
import resnyx.common.InputFile;
import resnyx.common.SendOptions;
import resnyx.messenger.general.GetMe;
import resnyx.messenger.general.SendDocument;
import resnyx.messenger.general.SendMessage;
import resnyx.messenger.rich.InputRichMessage;
import resnyx.messenger.rich.SendRichMessage;
import resnyx.util.TgObjectMapperConfig;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

@Slf4j
class MethodExec {

    private static final String USER_CHAT_ID_KEY = "user.chat.id";
    private static final String GROUP_CHAT_ID_KEY = "group.chat.id";
    private static final String BOT_TOKEN_KEY = "bot.token";

    private static String userChatId;
    private static String groupChatId;
    private static String botToken;

    @BeforeAll
    static void setUp() throws IOException {
        Properties props = new Properties();
        try (FileReader reader = new FileReader("tg.properties")) {
            props.load(reader);
        }
        userChatId = props.getProperty(USER_CHAT_ID_KEY);
        groupChatId = props.getProperty(GROUP_CHAT_ID_KEY);
        botToken = props.getProperty(BOT_TOKEN_KEY);
    }

    static String send(TgMethod method) {
        JacksonObjectMapper om = new JacksonObjectMapper(new TgObjectMapperConfig());
        Unirest.config().setObjectMapper(om);

        LOG.info("method = '{}', req = {}", method.methodName(), om.writeValue(method));
        HttpRequestWithBody req = Unirest.post(String.format("https://api.telegram.org/bot%s/%s", botToken, method.methodName()));
        String resp;
        if (method.hasInputFile()) {
            Map<String, Object> fields = method.toValues(om.getJacksonMapper());
            resp = req.contentType(ContentType.MULTIPART_FORM_DATA.getMimeType())
                    .accept(ContentType.APPLICATION_JSON.getMimeType())
                    .fields(fields)
                    .asString()
                    .getBody();
        } else {
            resp = req.contentType(ContentType.APPLICATION_JSON.getMimeType())
                    .body(method)
                    .asString()
                    .getBody();
        }
        LOG.info("resp = {}", resp);
        return resp;
    }

    static <T> T send(TgMethod method, Class<T> clz) {
        String result = send(method);
        return Unirest.config().getObjectMapper().readValue(result, clz);
    }

    void sendSimple() {
        send(new GetMe());
    }

    void sendGroup() {
        SendMessage sm = new SendMessage(groupChatId, "Hello world");
        SendOptions opts = new SendOptions();
        opts.setDisableNotification(Boolean.TRUE);
        send(sm);
    }

    void sendMultipart() {
        SendDocument method = new SendDocument(userChatId, new InputFile(new File("942707.torrent")));
        method.setCaption(new Caption("Barbie"));
        method.setDisableContentTypeDetection(true);
        SendOptions opts = new SendOptions();
        opts.setProtectContent(true);
        send(method);
    }

    void sendRich() {
        InputRichMessage m = new InputRichMessage();
        m.setMarkdown("## Test Rich Message\n$(a + b)^2 = a^2 + 2ab + b^2$");
        SendRichMessage method = new SendRichMessage(userChatId, m);
        send(method);
    }

}
