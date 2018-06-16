package sr.unasat.ad.sort.simple;

public class BubbleSort {

    /*
    Time Complexity: O(n^2)
    Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
    Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
    Auxiliary Space: O(1)
    Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
    */
    static int[] sort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1; // set index of the last element
        while (!isSorted) {
            /*the for loop lets the highest value bubble up
            to make sure that the higesth index contains the higest value*/
            for (int i = 0; i < lastUnsorted; i++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            lastUnsorted--;
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}

