package sr.unasat.ad.search;

public class App {

    public static void main(String[] args) {
        int[] dataSet = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // String[] data = {"10","20","30","40","50","60","70","80","90","100"};

     /*   int termFoundAtIndex = SearchService.linearSearch(-2, dataSet);

        if (termFoundAtIndex >= 0) {
            System.out.println("De index waar de zoekterm voorkomt is " + termFoundAtIndex);
        } else {
            System.out.println("De zoekterm komt niet voor in de dataset");
        }*/

        System.out.println(SearchService.binarySearchIterative(dataSet, 20));
    }
}
