package resnyx.updates;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GetWebhookInfoTest {

    @Test
    void testMethodName() {
        GetWebhookInfo getWebhookInfo = new GetWebhookInfo();
        String method = getWebhookInfo.methodName();
        Assertions.assertThat(method).isEqualToIgnoringCase("getWebhookInfo");
    }
}