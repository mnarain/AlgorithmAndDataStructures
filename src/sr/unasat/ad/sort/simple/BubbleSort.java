package sr.unasat.ad.sort.simple;

import sr.unasat.ad.common.Swap;
import sr.unasat.ad.entities.Person;

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
            to make sure that the highest index contains the highest value*/
            for (int currentIndex = 0; currentIndex < lastUnsorted; currentIndex++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (array[currentIndex] > array[currentIndex + 1]) {
                    Swap.execute(array, currentIndex, currentIndex + 1);
                }
            }
            lastUnsorted--;
        }
        return array;
    }


    static Person[] sortPersonList(Person[] array) {
        int lastUnsorted = array.length - 1; // set index of the last element
        while (lastUnsorted > 0) {
            /*the for loop lets the highest value bubble up
            to make sure that the highest index contains the highest value*/
            for (int currentIndex = 0; currentIndex < lastUnsorted; currentIndex++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (array[currentIndex].getFullname().compareToIgnoreCase(array[currentIndex + 1].getFullname()) > 0) {
                    Swap.execute(array, currentIndex, currentIndex + 1);
                }
            }
            lastUnsorted--;
        }
        return array;
    }

}

