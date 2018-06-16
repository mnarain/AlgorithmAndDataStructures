package sr.unasat.ad.sort.simple;

public class BubbleSort {

    //O(n2) exponential time complexity
    static int[] bubbleSort(int[] array) {
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

