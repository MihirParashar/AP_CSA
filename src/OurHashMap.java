public class OurHashMap {
    /*
    Hash Maps combine arrays, linked lists, and hash codes
    to create efficient get and put methods. We can create an
    array of linked lists called "buckets", and then place
    items in random buckets based on their hash code. This
    causes the items to be pretty evenly distributed across
    the buckets. Then, finding an item simply comes down to
    determining its bucket from its hash code, and iterating
    through the bucket to search for it.


    1. Determine number of slots, or "buckets". You can use
    any value, but: the larger the value, the more time-efficient,
    but the smaller the value, the less memory used.

    2. Create an array of linked lists, these are our buckets.

    void put(Object key, Object value):
    Determine the bucket number using the key's absolute
    hash code modulo the bucket count. Then, iterate thorugh
    the array, and check if the given key already exists. If
    it does, change its value. Otherwise, create a new Item
    at the first index of the bucket, and link it up.

    Object get(Object key):
    Get our bucket index using the key's hash code. Then,
    iterate through the bucket and return the value
    matching our key. Otherwise, return null.
     */

    class Item {
        public Object key;
        public Object value;
        public Item next;

        public Item(Object key, Object value, Item next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private static final int NUMBER_OF_BUCKETS = 32;
    private int size = 0;
    private Item[] buckets = new Item[NUMBER_OF_BUCKETS];

    public int size() {
        return size;
    }

    public void put(Object key, Object value) {
        int bucketIndex = Math.abs(key.hashCode()) % NUMBER_OF_BUCKETS;
        for (Item current = buckets[bucketIndex]; current != null; current = current.next) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
        }

        //If there is none, create a new start entry and link it to the original.
        buckets[bucketIndex] = new Item(key, value, buckets[bucketIndex]);
        size++;
    }

    public Object get(Object key) {
        int bucketIndex = Math.abs(key.hashCode()) % NUMBER_OF_BUCKETS;
        Item start = buckets[bucketIndex];
        for (Item current = start; current != null; current = current.next) {
            if (current.key.equals(key)) {
                return current.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        OurHashMap map = new OurHashMap();
        map.put(10, "Hello");
        System.out.println(map.get(10));
        System.out.println(map.size());
        map.put(10, "There");
        System.out.println(map.get(10));
        System.out.println(map.size());
        map.put(20, "Where");
        System.out.println(map.get(20));
        System.out.println(map.size());
    }
}