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
    public static int[] execute(int[] array) {
        int size = array.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < size; ++firstUnsortedIndex) {
            int firstUnsortedValue = array[firstUnsortedIndex];
            int sortedIndex = firstUnsortedIndex - 1;

            /* Move elements of array[0..firstUnsortedIndex-1], that are
               greater than firstUnsortedValue, to one position ahead
               of their current position */
            while (sortedIndex >= 0 && array[sortedIndex] > firstUnsortedValue) {
                //swap values of sorted part that are higher
                array[sortedIndex + 1] = array[sortedIndex];
                sortedIndex = sortedIndex - 1;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }


    public static void main(String[] args) {

    }

}