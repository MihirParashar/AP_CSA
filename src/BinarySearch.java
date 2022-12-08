public class BinarySearch {
    /*
    BINARY SEARCH: A recursive algorithm to check if an item is in a SORTED array.
    BEST CASE: O(1)
    WORST CASE: O(log n)
    AVERAGE CASE: O(log n)

    Binary search only works for sorted arrays, but it is extremely
    fast and simple because it cuts the problem in half every time.

    1. If the array length is 0, return false, because an item
    can't be in an array of length 0.

    2. If the middle value is equal to our search value, return true.

    3. If the value we are looking for is GREATER than the middle item
    of the array, repeat steps 1-2 on the first half of the array. If
    the value is SMALLER than the middle item, repeat steps 1-2 on the
    second half.
     */

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 8, 10};
        System.out.println(search(nums, 5));
    }

    //Starts off recursion chain, public method
    public static boolean search(int[] items, int value) {
        return search(items, value, 0, items.length);
    }

    //Private helper method (recursive)
    private static boolean search(int[] items, int value, int start, int end) {
        //If start == end, our array is empty, so the value can't be in it.
        if (start == end) {
            return false;
        }

        int middleIndex = (start + end) / 2;
        int middleItem = items[middleIndex];

        if (value == middleItem) {
            return true;
        } else if (value < middleItem) {
            return search(items, value, start, middleIndex);
        } else {
            return search(items, value, middleIndex + 1, end);
        }
    }
}


