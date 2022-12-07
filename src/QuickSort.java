import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class QuickSort {
    /*
    QUICK SORT: A  recursive sorting algorithm, considered the
    fastest out of all sorting algorithms, hence its name.
    BEST CASE: O(n * log(n))
    WORST CASE: O(n^2)
    AVERAGE CASE: O(n * log(n))

    Quicksort needs to choose a "pivot" value. You can choose
    any item in the list as the pivot, but we will use the
    FIRST element.

    1. Store your pivot value (first element), and keep track
     of a pivot index, starting at 1. This will be where the
     pivot value should go after iterating.

    2. Iterate through every item starting at the second
    element. If the element is less than the pivot value,
    swap it with the element at the current pivot index,
    and increment the pivot index.

    3. Decrement the pivot index to account for the index
    being offset (because the first element is ignored).

    4. Swap the first element and the pivot index.

    5. Repeat steps 1-4 recursively on the left and right
    parts of the array (excluding the pivot), until every
    subarray is length 1 or 0, at which point it's sorted.
     */

    public static void main(String[] args) {
        int[] values = new int[] {5, 1, 3, 6, 4, 2, 8, 7, 9};
        quickSort(values);
        System.out.println(Arrays.toString(values));
    }

    //Sets off the recursion chain, method that gets called first
    public static void quickSort(int[] values) {
        quickSort(values, 0, values.length);
    }

    //Recursive part, helper method
    private static void quickSort(int[] values, int start, int end) {
        if (end - start <= 1) {
            return;
        }

        int partitionIndex = partition(values, start, end);
        quickSort(values, 0, partitionIndex);
        quickSort(values, partitionIndex + 1, end);
    }

    public static int partition(int[] values, int start, int end) {
        int pivot = values[start];
        int pivotIndex = start + 1;
        for (int i = start; i < end; i++) {
            if (values[i] < pivot) {
                swap(values, i, pivotIndex);
                pivotIndex++;
            }
        }
        pivotIndex--;
        swap(values, start, pivotIndex);
        return pivotIndex;
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
