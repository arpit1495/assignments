import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PingerTest {

    @Test
    void test1() {
        assertTrue(Pinger.runSystemCommand("8.8.8.8", 5));
    }
    @Test
    void test2() {
        assertTrue(Pinger.runSystemCommand("localhost", 2));
    }
    @Test
    void test3() {
        assertFalse(Pinger.runSystemCommand("255.255.255.255", 5));
    }
    @Test
    void test4() {
        assertFalse(Pinger.runSystemCommand("AAAAAAAAAA", 5));
    }
    @Test
    void test5() {
        assertFalse(Pinger.runSystemCommand("8.8.8.8", 0));
    }
    @Test
    void test6() {
        assertFalse(Pinger.runSystemCommand("", 5));
    }
}