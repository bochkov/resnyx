package resnyx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import resnyx.model.Update;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Answers {

    private static final Logger LOG = LoggerFactory.getLogger(Answers.class);

    @PostMapping("/bot/{token}")
    public void incoming(@PathVariable String token, @RequestBody Update payload) {
        LOG.info(payload.toString());
        String chatId = payload.getMessage().getChat().getId();
        outgoing(token, chatId, "Your chatId = " + chatId);
    }

    private void outgoing(String token, String chatId, String message) {
        LOG.info("Sending '{}' to {}", message, chatId);
        Map<String, Object> params = new HashMap<>();
        params.put("chat_id", chatId);
        params.put("text", message);
        params.put("disable_web_page_preview", true);
        String url = String.format("https://api.telegram.org/bot%s/sendMessage", token);
        String resp = new RestTemplate()
                .getForEntity(url, String.class, params)
                .toString();
        LOG.info(resp);
    }
}
