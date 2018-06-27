package sr.unasat.ad.common;

public class CompareTo {
    public static int execute(int value1, int value2) {
        if (value1 != value2) {
            return (value1 > value2) ? -1 : 1;
        }
        return 0;
    }


    public static int execute(String value1, String value2) {

        if (!value1.equals(value2)) {
            int shortestStringLength = (value1.length() < value2.length()) ? value1.length() : value2.length();

            //value1 eerste karakter kleiner value2 eerste karakter
            for (int i = 0; i < shortestStringLength; i++) {
                if (value1.charAt(i) != value2.charAt(i)) {
                    return (value1.charAt(i) < value2.charAt(i)) ? 1 : -1;
                    //value1 eerste karakter groter value2 eerste karakter
                }
            }
            //karakter reeeks hetzelfde, values niet dezelfde lengte (vb scenario: jan, jandino)
            return (value1.length() < value2.length()) ? 1 : -1;
        }

        // value1 equals value2
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(execute("Jan", "Jan"));
        System.out.println(execute("Jan", "Jandino"));
        System.out.println(execute("Jan", "Anna"));
    }
}
