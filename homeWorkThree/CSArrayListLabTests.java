import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class CSArrayListLabTests {
    private CSArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new CSArrayList<>();
    }

    @Test
    void testAddAndGetEdgeCases() {
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(list.size()-1));
    }

    @Test
    void testGetInvalidIndices() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(list.size()));
    }

    @Test
    void testMultipleResizes() {
        int n = 10_000;
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        assertEquals(n, list.size());
        assertEquals(0, list.get(0));
        assertEquals(n - 1, list.get(n - 1));
    }

    @Test
    void testIndexOfWithDuplicates() {
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        assertEquals(0, list.indexOf(1));
        assertEquals(1, list.indexOf(2));
        assertEquals(-1, list.indexOf(99));
    }

    @Test
    void testIndexOfWithNulls() {
        list.add(null);
        list.add(5);
        list.add(null);
        assertEquals(0, list.indexOf(null));
    }

    @Test
    void testRemovePresentElement() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.remove(Integer.valueOf(2)));
        //assertEquals(2, list.size());
        assertEquals(3, list.get(1));
    }

    @Test
    void testRemoveAbsentElement() {
        list.add(1);
        list.add(2);
        assertFalse(list.remove(Integer.valueOf(99)));
        assertEquals(2, list.size());
    }

    @Test
    void testRemoveNull() {
        list.add(null);
        list.add(1);
        assertTrue(list.remove(null));
        //assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    void testIteratorFailFastOnAdd() {
        list.add(1);
        list.add(2);
        Iterator<Integer> it = list.iterator();
        list.add(3);
        assertThrows(ConcurrentModificationException.class,
                it::next);
    }

    @Test
    void testIteratorFailFastOnRemove() {
        list.add(1);
        list.add(2);
        Iterator<Integer> it = list.iterator();
        list.remove(Integer.valueOf(1));
        assertThrows(ConcurrentModificationException.class,
                it::next);
    }

    @Test
    void testIteratorNormalTraversal() {
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> it = list.iterator();
        assertEquals(1, it.next());
        assertEquals(2, it.next());
        assertEquals(3, it.next());
        assertFalse(it.hasNext());
    }

}
