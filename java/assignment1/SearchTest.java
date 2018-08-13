import org.junit.jupiter.api.Test;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void test1() {
        assertEquals(12, Search.fileFinder(".*java$"));//
        assertEquals(0, Search.fileFinder(".*exe$"));
        assertEquals(34, Search.fileFinder("^[A-Z].*"));
        assertEquals(0, Search.fileFinder(""));
    }
    @Test
    void test2(){
        File file = new File("/home/lenovo/things.zip");
        String[] path = {file.getAbsolutePath()};
        assertTrue(Arrays.equals(path, Search.checker("things.zip")));
    }
}