package sr.unasat.ad.sort.excercises;

import sr.unasat.ad.common.CompareTo;
import sr.unasat.ad.common.PrintToConsole;

public class ReversedInsertionSort {

    /*
      Time Complexity: O(n^2)
      Auxiliary Space: O(1)
      Boundary Cases: Insertion sort takes maximum time
      to sort if elements are sorted in reverse order.
      And it takes minimum time (Order of n)
      when elements are already sorted.
     */
    public static int[] execute(int[] array) {
        int size = array.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < size; ++firstUnsortedIndex) {
            int firstUnsortedValue = array[firstUnsortedIndex];
            int sortedIndex = firstUnsortedIndex - 1;

            /* Move elements of array[0..firstUnsortedIndex-1], that are
               greater than firstUnsortedValue, to one position ahead
               of their current position */
            while (sortedIndex >= 0 && array[sortedIndex] < firstUnsortedValue) {
                //swap values of sorted part that are higher
                array[sortedIndex + 1] = array[sortedIndex];
                sortedIndex = sortedIndex - 1;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }

    public static String[] execute(String[] array) {
        int size = array.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < size; ++firstUnsortedIndex) {
            String firstUnsortedValue = array[firstUnsortedIndex];
            int sortedIndex = firstUnsortedIndex - 1;

            /* Move elements of array[0..firstUnsortedIndex-1], that are
               greater than firstUnsortedValue, to one position ahead
               of their current position */
            while (sortedIndex >= 0 && CompareTo.execute(array[sortedIndex], firstUnsortedValue) == -1) {
                //swap values of sorted part that are higher
                array[sortedIndex + 1] = array[sortedIndex];
                sortedIndex = sortedIndex - 1;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {100, 10, 300, 90};
        PrintToConsole.execute(ReversedInsertionSort.execute(unsortedArray));
        String[] unsortedStringArray = {"sap", "appel", "sinaasappel", "appelsap"};
        PrintToConsole.execute(ReversedInsertionSort.execute(unsortedStringArray));
    }

}