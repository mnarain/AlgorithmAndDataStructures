package sr.unasat.ad.common;

import sr.unasat.ad.entities.Person;

import java.util.Arrays;

public class PrintToConsole {

    public static void execute(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void execute(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void execute(Person[] array) {
        System.out.println(Arrays.toString(array));
    }
}
