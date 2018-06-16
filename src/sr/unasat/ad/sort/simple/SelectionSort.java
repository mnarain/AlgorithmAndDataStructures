package sr.unasat.ad.sort.simple;

public class SelectionSort {

    /*
    Time Complexity: O(n^2) as there are two nested loops.
    Auxiliary Space: O(1)
    The good thing about selection sort is it never makes
    more than O(n) swaps and can be useful
    when memory write is a costly operation.
    */

    static void sort(int[] array) {
        int size = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < size; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }


}
