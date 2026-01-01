package resnyx.messenger.general;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import resnyx.updates.Update;
import tools.jackson.databind.json.JsonMapper;

@Slf4j
class MaybeInaccessibleMessageTest {

    String json = """
            {
                "update_id": 112312,
                "message": {
                    "message_id": 2233,
                    "text": "hello world",
                    "date": 22342322
                }
            }
            """;

    JsonMapper mapper = JsonMapper.builder()
            .build();

    @Test
    void testDeserialize() {
        Update upd = mapper.readValue(json.getBytes(), Update.class);
        Assertions.assertThat(upd.getUpdateId()).isEqualTo(112312L);
        Assertions.assertThat(upd.getMessage()).isOfAnyClassIn(Message.class);
    }
}