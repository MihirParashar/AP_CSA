import java.util.Arrays;
public class InsertionSort {
    /*
    INSERTION SORT: A sorting algorithm.
    BEST CASE: O(n)
    WORST CASE: O(n^2)
    AVERAGE CASE: O(n^2)
    - There are two parts of the array: sorted & unsorted.
    1. Iterate through each item in the array, starting from 1 (i).
    2. In each iteration, iterate downwards starting from i, excluding 0 (j).
    3. Check if the current item (j) is less than the previous item (j-1). If so, swap the items.
     */

    public static void main(String[] args) {
        Comparable[] values = new Comparable[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int swaps = insertionSort(values);
        System.out.println("Swaps: " + swaps);
        System.out.println("Sorted: " + Arrays.toString(values));
    }


    public static int insertionSort(Comparable[] items) {
        if (items == null) {
            throw new IllegalArgumentException();
        }
        int swaps = 0;
        //Seperator between unsorted and sorted
        for (int i = 1; i < items.length; i++) {
            for (int j = i; j > 0; j--) {
                //If the current item is less than the previous item, swap them.
                if (isLesser(items[j], items[j - 1])) {
                    Comparable temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }

    private static boolean isLesser(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
