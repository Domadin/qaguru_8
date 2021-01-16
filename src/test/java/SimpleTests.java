import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleTests {
    @Test
    void positiveTest() {
        assertEquals(2 + 2, 4);
    }

    @Test
    void negativeTest() {
        assertNotEquals(2 + 2, 5);
    }

    @Test
    void someTest() {
        assertNotEquals(3 + 3, 6);
    }
}
