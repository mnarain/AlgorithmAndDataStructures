/*
package sr.unasat.ad.sort.advanced;

import sr.unasat.ad.common.Swap;

class QuickSort {

    public static void main(String[] args) {
        int[] array = {30,10,50,1,100,2,40,45};
        QuickSort.execute(array, 0, array.length-1);
    }

    public static void execute(int[] array, int left, int right) {
        if (right - left <= 0)
            return; // already sorted
        else // size is 2 or larger
        {
            long pivot = array[right]; // rightmost item

            // partition range
            int partition = partitionIt(array, left, right, pivot);
            execute(array, left, partition - 1); // sort left side
            execute(array, partition + 1, right); // sort right side
        }
    }


    public static int partitionIt(int[] array, int left, int right, int pivot) {
        int leftPointer = left - 1; // left (after ++)
        int rightPtr = right; // right-1 (after --)
        while (true) { // find bigger item
            while (array[++leftPointer] < pivot) {}
             // find smaller item
            while (rightPtr > 0 && array[--rightPtr] > pivot){}
            if (leftPointer >= rightPtr) // if pointers cross,
                break; // partition done
            else // not crossed, so
                Swap.execute(array, leftPointer, rightPtr); // swap elements
        } // end while(true)
        Swap.execute(array, leftPointer, right); // restore pivot
        return leftPointer; // return pivot location
    }


}

*/
