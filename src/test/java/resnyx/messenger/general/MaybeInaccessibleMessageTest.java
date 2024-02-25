package resnyx.messenger.general;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import resnyx.updates.Update;

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

    ObjectMapper om = new ObjectMapper();

    @Test
    void testDeserialize() throws Exception {
        Update upd = om.readValue(json.getBytes(), Update.class);
        Assertions.assertThat(upd.getUpdateId()).isEqualTo(112312L);
        Assertions.assertThat(upd.getMessage()).isOfAnyClassIn(Message.class);
    }
}