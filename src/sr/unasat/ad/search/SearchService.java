package sr.unasat.ad.search;

public class SearchService {

    //linear search O(n)
    static int linearSearch(int term, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term == data[i]) {
                return i; //term found return index
            }
        }
        return -1; //term not found
    }

    //linearySearch(String term, String array) --> return een nette text(String) met de uitkomst
    //binearySearch(term, array)

    // iterative
    //bineary search O(log n)
    static int binearySearchIterative(int[] array, int term) {
        int left = 0; // min index
        int right = array.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] == term) { // search term found
                return array[mid]; // return array index of search term
            } else if (term < array[mid]) { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return -1;
    }

    // recursive
    //bineary search O(log n)
    static int binearySearchRecursive(int[] array, int term, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (array[mid] == term) { // search term found
            return array[mid]; // return array index of search term
        } else if (term < array[mid]) { // search term is smaller than mid point value
            // right bound = mid - 1;
            return binearySearchRecursive(array, term, left, mid - 1); // set right bound
        } else {
            // left bound = mid + 1;
            return binearySearchRecursive(array, term, mid + 1, right); // set left bound
        }
    }
}

