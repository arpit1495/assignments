import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    @Test
    void test1() {
        assertEquals("ParseException caught : Enter a valid date", Range.checker("ABCDEFG"));
    }
    @Test
    void test2() {
        assertEquals("16-06-2017 27-06-2017", Range.checker("16-07-1998 27-06-2017"));
    }
    @Test
    void test3() {
        assertEquals("No range", Range.checker("04-05-2017 04-04-2017"));
    }
    @Test
    void test4() {
        assertEquals("No range", Range.checker("05-04-2016 15-02-2017"));
    }
    @Test
    void test5() {
        assertEquals("No range", Range.checker("05-03-2016 15-03-2016"));
    }
    @Test
    void test6() {
        assertEquals("05-03-2017 15-03-2017", Range.checker("04-04-2016 15-03-2017"));
    }


}