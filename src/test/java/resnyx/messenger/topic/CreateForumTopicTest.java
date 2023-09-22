package resnyx.messenger.topic;

import kong.unirest.jackson.JacksonObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateForumTopicTest {

    @Test
    void test() throws Exception {
        CreateForumTopic method = new CreateForumTopic("1123", "234234");
        method.setIconColor(TopicColor.GREEN);
        JacksonObjectMapper om = new JacksonObjectMapper();
        String json = om.getJacksonMapper().writeValueAsString(method);
        Assertions.assertThat(json).contains("\"icon_color\":9367192");
    }

}