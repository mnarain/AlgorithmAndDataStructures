package sr.unasat.ad.common;

public class CompareTo {
    public static int execute(int value1, int value2) {
        if (value1 != value2) {
            return (value1 > value2) ? 1 : -1;
        }
        return 0;
    }

}
