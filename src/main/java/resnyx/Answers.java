package resnyx;

import com.jcabi.http.request.JdkRequest;
import com.jcabi.http.wire.RetryWire;
import com.jcabi.http.wire.TrustedWire;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import resnyx.model.Update;

import java.io.IOException;

@RestController
public class Answers {

    private static final Logger LOG = LoggerFactory.getLogger(Answers.class);

    @PostMapping("/bot/{token}")
    public void incoming(@PathVariable String token, @RequestBody Update payload) throws IOException {
        LOG.info(payload.toString());
        String chatId = payload.getMessage().getChat().getId();
        outgoing(token, chatId, "Your chatId = " + chatId);
    }

    private void outgoing(String token, String chatId, String message) throws IOException {
        LOG.info("Sending '{}' to {}", message, chatId);
        String resp = new JdkRequest("https://api.telegram.org")
                .uri()
                .path(String.format("bot%s/sendMessage", token))
                .queryParam("chat_id", chatId)
                .queryParam("text", message)
                .queryParam("disable_web_page_preview", "true")
                .back()
                .through(RetryWire.class)
                .fetch()
                .body();
        LOG.info(resp);
    }
}
