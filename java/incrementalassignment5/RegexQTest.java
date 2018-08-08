import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexQTest {

    @Test
    void test1() {
        assertTrue(RegexQ.checker("Hello."));
    }

    @Test
    void test2() {
        assertTrue(RegexQ.checker("H."));
    }

    @Test
    void test3() {
        assertFalse(RegexQ.checker("hello."));
    }

    @Test
    void test4() {
        assertFalse(RegexQ.checker(""));
    }
}