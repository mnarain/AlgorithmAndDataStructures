package sr.unasat.ad.common;

import sr.unasat.ad.entities.Person;

public class Swap {
                                             //      10               7
    public static void execute(int[] array, int currentIndex, int nextIndex) {
        int tmp = array[currentIndex]; //10
        array[currentIndex] = array[nextIndex]; //7
        array[nextIndex] = tmp; //10
    }  //7 10

    public static void execute(String[] array, int i, int j) {
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void execute(Person[] array, int i, int j) {
        Person tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
