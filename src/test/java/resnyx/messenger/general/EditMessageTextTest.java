package resnyx.messenger.general;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EditMessageTextTest {

    @Test
    void testMessageName() {
        EditMessageText emt = new EditMessageText("1", 2L, "1234");
        Assertions.assertThat(emt.methodName()).isEqualTo("EditMessageText");
    }
}