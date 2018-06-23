package sr.unasat.ad.common;

import sr.unasat.ad.entities.Person;

public class Swap {

    public static void execute(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

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
