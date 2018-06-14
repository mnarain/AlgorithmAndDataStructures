package sr.unasat.ad.search;

public class SearchService {

    public static int linearySearch(int term, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term == data[i]) {
                return i;
            }
        }
        return -1;
    }

    //linearySearch(String term, String array) --> return een nette text(String) met de uitkomst
    //binearySearch(term, array)
}

