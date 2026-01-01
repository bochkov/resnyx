package resnyx.messenger.chat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.json.JsonMapper;

class ChatBoostSourceTest {

    JsonMapper mapper = JsonMapper.builder()
            .build();

    @Test
    void testPremium() {
        String json = """
                {
                    "source" : "premium",
                    "user": {
                        "id": 12331,
                        "first_name": "Vasya"
                    }
                }
                """;
        ChatBoostSourcePremium value = (ChatBoostSourcePremium) mapper.readValue(json.getBytes(), ChatBoostSource.class);
        Assertions.assertThat(value.getUser().getFirstName()).isEqualTo("Vasya");
    }

}