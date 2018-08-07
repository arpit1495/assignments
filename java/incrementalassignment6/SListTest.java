import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SListTest {

    @Test
    void test1() {
        SList<Integer> s1 = new SList<>();
        SListIterator<Integer> itr1 = s1.iterator();
        itr1.add(5);
        itr1.add(6);
        itr1.add(7);
        itr1.remove(6);
        String str = s1.toString();
        assertEquals("5 7 ", str);

    }
    @Test
    void test2() {
        SList<String> s1 = new SList<>();
        SListIterator<String> itr1 = s1.iterator();
        itr1.add("A");
        itr1.add("B");
        itr1.add("C");
        String str = s1.toString();
        assertEquals("A B C ", str);
    }
    @Test
    void test3() {
        SList<Double> s1 = new SList<>();
        SListIterator<Double> itr1 = s1.iterator();
        itr1.add(0.2);
        itr1.add(0.9);
        String str = s1.toString();
        assertEquals("0.2 0.9 ", str);
    }
}