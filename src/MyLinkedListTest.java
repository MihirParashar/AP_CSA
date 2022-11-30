import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    @Test
    public void TestLinkedListGet() {
        MyLinkedList l = new MyLinkedList(new Integer[] {1, 2, 3, 4, 5});
        assertEquals(l.get(3), 4);
        assertEquals(l.get(0), 1);
        assertEquals(l.get(4), 5);
        assertEquals(l.size(), 5);
        assertThrows(IllegalArgumentException.class, () -> l.get(-1));
        assertThrows(IllegalArgumentException.class, () -> l.get(5));
    }

    @Test
    public void TestLinkedListSet() {
        MyLinkedList l = new MyLinkedList(new Integer[] {1, 2, 3, 4, 5});
        l.set(3, 18);
        l.set(0, 19);
        l.set(4, 10);
        assertEquals(l.get(3), 18);
        assertEquals(l.get(0), 19);
        assertEquals(l.get(4), 10);
        assertThrows(IllegalArgumentException.class, () -> l.set(-1, 3));
        assertThrows(IllegalArgumentException.class, () -> l.set(10, 3));

    }

    @Test
    public void TestLinkedListAdd() {
        MyLinkedList l = new MyLinkedList(new Integer[] {1, 2, 3, 4, 5});
        l.add(5, 6);
        assertEquals(l.get(5), 6);
        l.add(0, 99);
        assertEquals(l.get(0), 99);
        l.add(0, 100);
        assertEquals(l.get(0), 100);
    }

    @Test
    public void TestLinkedListAddNull() {
        MyLinkedList l = new MyLinkedList(null);
        for (int i = 0; i < 10; i++) {
            l.add(i, i + 1);
        }
        assertEquals(l.get(0), 1);
        assertEquals(l.get(9), 10);
    }
}