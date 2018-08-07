import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VampireTest {

    @Test
    void main() {
        assertTrue(Vampire.checker(1260));
        assertFalse(Vampire.checker(1206));
        assertFalse(Vampire.checker(182660));
        assertFalse(Vampire.checker(1000));
    }
}