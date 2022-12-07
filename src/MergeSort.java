import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

public class MergeSort {
    /*
    MERGE SORT: A recursive sorting algorithm.
    BEST CASE: O(n*log(n))
    WORST CASE: O(n*log(n))
    AVERAGE CASE: O(n*log(n))

    1. Split the array into two parts over and over again,
    until there are n arrays containing only 1 item.

    2. Merge the array pairs recursively until we are back
    into a single array, using the following steps:

        1. Iterate through both arrays, keeping track of the two indexes.

        2. Compare both items at their index. Add the smaller item and increment its index.

        3. If we have reached the end of one array, add the next item of the other array.

        4. Continue until we reach the end of both arrays.
     */

    public static void main(String[] args) {
        int[] values = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(values)));
    }

    private static int[] mergeSort(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException();
        }

        //An empty or single-element array is already sorted, so just return it.
        if (values.length <= 1) {
            return values;
        }
        //Split the array into two parts.
        int middleIndex = Math.round(values.length / 2);
        int[] valuesA = copyOfRange(values, 0, middleIndex);
        int[] valuesB = copyOfRange(values, middleIndex, values.length);

        //Recursively merge sort the two parts and merge the result.
        return merge(mergeSort(valuesA), mergeSort(valuesB));
    }

    private static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int aIndex = 0, bIndex = 0;
        for (int i = 0; i < merged.length; i++) {
            if (aIndex == a.length) {
                merged[i] = b[bIndex++];
            } else if (bIndex == b.length) {
                merged[i] = a[aIndex++];
            } else if (a[aIndex] < b[bIndex]) {
                merged[i] = a[aIndex++];
            } else {
                merged[i] = b[bIndex++];
            }
        }
        return merged;
    }
}
