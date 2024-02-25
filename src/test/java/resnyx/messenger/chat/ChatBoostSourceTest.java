package resnyx.messenger.chat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChatBoostSourceTest {

    ObjectMapper om = new ObjectMapper();

    @Test
    void testPremium() throws Exception {
        String json = """
                {
                    "source" : "premium",
                    "user": {
                        "id": 12331,
                        "first_name": "Vasya"
                    }
                }
                """;
        ChatBoostSourcePremium value = (ChatBoostSourcePremium) om.readValue(json.getBytes(), ChatBoostSource.class);
        Assertions.assertThat(value.getUser().getFirstName()).isEqualTo("Vasya");
    }

}