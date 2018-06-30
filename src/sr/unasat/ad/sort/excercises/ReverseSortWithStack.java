package sr.unasat.ad.sort.excercises;

import sr.unasat.ad.common.PrintToConsole;
import sr.unasat.ad.sort.simple.InsertionSort;
import sr.unasat.ad.stack.StackImpl;

public class ReverseSortWithStack {

    public static void main(String[] args) {
        int[] unsortedArray = {100, 10, 300, 90};
        //vb 1
        PrintToConsole.execute(new StackImpl(InsertionSort.execute(unsortedArray)).reverseOrderArray());
/*
vb2
  //sort array
        int[] sortedArray = InsertionSort.execute(unsortedArray);
        //aanmaken stack
        StackImpl stack = new StackImpl(sortedArray);
        PrintToConsole.execute(stack.reverseOrderArray());
        */


    }


    //pop from stack
    //return reversed sorted array
}
