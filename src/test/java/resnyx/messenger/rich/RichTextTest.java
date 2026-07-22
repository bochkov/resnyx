package resnyx.messenger.rich;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import resnyx.TgMethodResult;
import resnyx.messenger.general.Message;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;

class RichTextTest {

    String json = """
            {
                "ok": true,
                "result": {
                    "message_id": 9999,
                    "from": {
                        "id": 101,
                        "is_bot": true,
                        "first_name": "test",
                        "username": "test_bot"
                    },
                    "chat": {
                        "id": 1,
                        "first_name":"Test",
                        "last_name":"Bot",
                        "username":"testbot",
                        "type":"private"
                    },
                    "date": 1784708343,
                    "rich_message": {
                        "blocks": [
                            {
                                "type": "heading",
                                "text": "Test Rich Message",
                                "size": 2
                            },
                            {
                                "type":"paragraph",
                                "text": {
                                    "type":"mathematical_expression",
                                    "expression": "(a + b)^2 = a^2 + 2ab + b^2"
                                }
                            }
                        ]
                    }
                }
            }
            """;
    JsonMapper mapper = JsonMapper.builder()
            .build();

    @Test
    void testResponse() {
        TgMethodResult<?> result = mapper.readValue(json, TgMethodResult.class);
        Assertions.assertThat(result).isNotNull();

        Message msg = mapper.convertValue(result.getResult(), Message.class);
        Assertions.assertThat(msg).isNotNull();
        Assertions.assertThat(msg.getMessageId()).isEqualTo(9999L);

        RichMessage rm = msg.getRichMessage();
        Assertions.assertThat(rm).isNotNull();

        List<RichBlock> blocks = rm.getBlocks();
        Assertions.assertThat(blocks).hasSize(2);
    }
}