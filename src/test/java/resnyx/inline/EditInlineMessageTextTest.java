package resnyx.inline;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EditInlineMessageTextTest {

    @Test
    void testMethodName() {
        EditInlineMessageText editInlineMessageText = new EditInlineMessageText("1", "first");
        Assertions.assertThat(editInlineMessageText.methodName()).isEqualTo("editMessageText");
    }

}