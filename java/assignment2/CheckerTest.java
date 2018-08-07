import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    @Test
    void test1() {
        assertTrue(Checker.checkAlph("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void test2(){
        assertTrue(Checker.checkAlph("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    void test3(){
        assertFalse(Checker.checkAlph("abcd"));
    }
    @Test
    void test4(){
        assertFalse(Checker.checkAlph("123"));
    }
    @Test
    void test5(){
        assertFalse(Checker.checkAlph(" "));
    }
}