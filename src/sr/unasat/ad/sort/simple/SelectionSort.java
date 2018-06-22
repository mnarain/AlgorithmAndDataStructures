package sr.unasat.ad.sort.simple;

public class SelectionSort {

    /*
    Time Complexity: O(n^2) as there are two nested loops.
    Auxiliary Space: O(1)
    The good thing about selection sort is it never makes
    more than O(n) swaps and can be useful
    when memory write is a costly operation.
    */

    static int[] sort(int[] array) {
        int size = array.length;
        // One by one move boundary of unsorted subarray
        for (int leftBound = 0; leftBound < size - 1; leftBound++) {
            // Find the minimum element in unsorted array
            int unsortedMinimum = leftBound;
            for (int currentIndex = leftBound + 1; currentIndex < size; currentIndex++) {
                if (array[currentIndex] < array[unsortedMinimum]) {
                    unsortedMinimum = currentIndex;
                }
            }
            if (leftBound != unsortedMinimum) {
                swap(array, leftBound, unsortedMinimum);
            }
        }
        return array;
    }

    private static void swap(int[] array, int leftBound, int unsortedMinimum) {
        // Swap the found minimum element with the first
        // element
        int temp = array[unsortedMinimum];
        array[unsortedMinimum] = array[leftBound];
        array[leftBound] = temp;
    }

    public static void main(String[] args) {
        int[] array = {105, 2, 30, 4, 3000, 5, 70, 14, 7, 0};
        System.out.println(array);
        int[] sortedArray = sort(array);
        for (int element : sortedArray) {
            System.out.println(element);
        }
    }

}