import java.util.Arrays;
import static java.util.Arrays.copyOfRange;

public class MergeSort {
    /*
    MERGE SORT: A sorting algorithm.
    BEST CASE: O(n*log(n))
    WORST CASE: O(n*log(n))
    AVERAGE CASE: O(n*log(n))
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
        int middleIndex = values.length >>> 1;
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
            }
            if (bIndex == b.length) {
                merged[i] = a[aIndex++];
            }

            if (a[aIndex] < b[bIndex]) {
                merged[i] = a[aIndex++];
            } else {
                merged[i] = b[bIndex++];
            }
        }
        return merged;
    }
}
