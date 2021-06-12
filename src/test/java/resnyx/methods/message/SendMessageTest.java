package resnyx.methods.message;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;
import resnyx.Answer;
import resnyx.model.Message;

public class SendMessageTest {

    @Test
    public void testMapping() throws IOException {
        SendMessage msg = new SendMessage();
        msg.setToken("302324829:AAGDDtvKkK9zS_oMdKPZmJi8Koiye5RZEs0");
        msg.setChatId(1982184L);
        msg.setText("Hello world");
        msg.setDisablePreview(Boolean.TRUE);
        msg.setParseMode("html");
        Assert.assertEquals("{\"text\":\"Hello world\",\"parse_mode\":\"html\",\"disable_web_page_preview\":true,\"chat_id\":1982184}", msg.toJson());
    }
}