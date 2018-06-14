package sr.unasat.ad.search;

public class App {

    public static void main(String[] args) {
        int[] dataSet = {12,3,7,20,4,3};
        int termFoundAtIndex = SearchService.linearySearch(-2, dataSet);

        if (termFoundAtIndex >= 0){
        System.out.println("De index waar de zoekterm voorkomt is " + termFoundAtIndex);
    }else{
            System.out.println("De zoekterm komt niet voor in de dataset");
        }

    }
}
