package sr.unasat.ad.common;

public class CompareTo {
    public static int execute(int value1, int value2) {
        if (value1 != value2) {
            return (value1 > value2) ? 1 : -1;
        }
        return 0;
    }

    public static int execute(String value1, String value2) {
        if (!value1.equals(value2)) {
            int shortestStringLength = (value1.length() < value2.length()) ? value1.length() : value2.length();
            for (int i = 0; i < shortestStringLength; i++) { //evalueer op basis van de grote van de character
                /*
                Methode 1
                if (value1.charAt(i) > value2.charAt(i)) {
                    return 1;
                }
                if (value1.charAt(i) < value2.charAt(i)) {
                    return -1;
                }*/

                //Methode 2
                if (value1.charAt(i) != value2.charAt(i)) {
                    return (value1.charAt(i) > value2.charAt(i)) ? 1 : -1;
                }
            }
            return (value1.length() > value2.length()) ? 1 : -1; //evalueer op basis van string length
        }
        return 0; // matching strings
    }

    public static void main(String[] args) {
        System.out.println(execute("Jan", "Jan"));
        System.out.println(execute("Jan", "Jandino"));
        System.out.println(execute("Jan", "Anna"));

        System.out.println("Jan".compareTo("Jan"));
        System.out.println("Jan".compareTo("Jandino"));
        System.out.println("Jan".compareTo("Anna"));
    }
}
// value1.equals(value2) return 0
//value1.charAt(i) > value2.charAt(i) return 1
//value1.charAt(i) < value2.charAt(i) return -1
//value 1 & value 2 ongelijke length vergelijk de length als v1 grotere lengte return 1 in ander geval min1

