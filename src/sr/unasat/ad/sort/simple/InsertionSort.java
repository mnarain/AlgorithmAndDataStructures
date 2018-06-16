package sr.unasat.ad.sort.simple;

public class InsertionSort {

    /*
      Time Complexity: O(n^2)
      Auxiliary Space: O(1)
      Boundary Cases: Insertion sort takes maximum time
      to sort if elements are sorted in reverse order.
      And it takes minimum time (Order of n)
      when elements are already sorted.
     */
    void sort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of array[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}