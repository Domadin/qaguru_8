import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleTests {
    @Test
    @DisplayName("Этот тест пройдёт")
    void positiveTest() {
        assertEquals(2 + 2, 4);
    }

    @Test
    @DisplayName("Этот тест упадёт")
    void negativeTest() {
        assertEquals(2 + 2, 5);
    }

    @Test
    @DisplayName("Этот тест отключёт")
    @Disabled("Отключен потому что я так повелел")
    void someTest() {
        assertNotEquals(3 + 3, 6);
    }
}
