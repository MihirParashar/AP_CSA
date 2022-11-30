public class LinkedLists {
    /*
    LINKED LIST: A data structure for ordered items. Like array lists, but it
    only stores a start node. However, each node stores a link its next node,
    allowing for a list of items to be stored. Best used for lists where we
    commonly need to access the start and end of the list, because it is faster
    than array lists in those scenarios.
     */

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList(new Integer[] {1, 2, 3, 4});
        System.out.println(l.get(3));
    }
}

interface MyList {
    public Object get(int index);
    public void set(int index, Object newValue);
    public void add(int index, Object newObject);
    public int size();
}

class MyLinkedList implements MyList {
    public Item start;
    private int size;

    public MyLinkedList(Object[] values) {
        if (values == null) {
            size = 0;
        } else {
            for (int i = values.length - 1; i >= 0; i--) {
                add(0, values[i]);
            }
        }
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Item current = start;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void set(int index, Object newValue) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            start.value = newValue;
        } else {
            Item current = start;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    current.value = newValue;
                    break;
                }
                current = current.next;
            }
        }
    }
    @Override
    public void add(int index, Object newObject) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            start = new Item(newObject, start);
        } else {
            Item current = start;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    current.next = new Item(newObject, current.next);
                }
                current = current.next;
            }
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    class Item {
        public Object value;
        public Item next;
        public Item(Object setValue, Item setNext) {
            value = setValue;
            next = setNext;
        }
        public Item(Object setValue) {
            value = setValue;
        }
    }
}

