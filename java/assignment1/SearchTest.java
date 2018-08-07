import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void main() {
        //Search test = new Search();
        assertEquals(12, Search.fileFinder(".*java$"));//
        assertEquals(0, Search.fileFinder(".*exe$"));
        assertEquals(34, Search.fileFinder("^[A-Z].*"));
        assertEquals(0, Search.fileFinder(""));
    }
}