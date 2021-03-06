import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReihenfolgeTest {
    Reihenfolge r1;

    @Before
    public void setUp() {
        r1 = new Reihenfolge(new String[][]{{"A", "B"}, {"B", "C"}});
    }

    @Test
    public void testMalEinfachSo() {
        assertTrue(r1.isWellSorted(new String[]{"A", "B", "C"}));
    }
    @Test
    public void testIsWellSorted() {
        assertFalse(r1.isWellSorted(new String[]{"A", "C", "B"}));
    }
    @Test
    public void testIsWellSorted2(){
        assertFalse(r1.isWellSorted(new String[]{"B", "A", "C"}));
    }

}