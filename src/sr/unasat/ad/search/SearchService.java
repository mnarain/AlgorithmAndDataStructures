package sr.unasat.ad.search;

public class SearchService {
    //Huiswerk
    //linearySearch(String term, String array) --> return een nette text(String) met de uitkomst
    //binearySearch(term, array)


    //Time Complexity: O(n)
    static int linearSearch(int term, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term == data[i]) {
                return i; //term found return index
            }
        }
        return -1; //term not found
    }

    static String linearSearchString(String term, String[] data) {
        for (int i = 0; i < data.length; i++) {
            if (term.equals(data[i])) {
                return "De zoekterm " + term + "is gevonden bij index: " + i; //term found return index
            }
        }
        return "De zoekterm komt niet voor in deze dataset"; //term not found
    }


    // iterative
    //Time Complexity: O(log n)
    static int binarySearchIterative(int[] array, int term) {
        int left = 0; // min index
        int right = array.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (array[mid] == term) { // search term found
                return mid; // return array index of search term
            } else if (term < array[mid]) { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return -1;
    }

    // recursive
    //Time Complexity: O(log n)
    static int binarySearchRecursive(int[] array, int term, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (array[mid] == term) { // search term found
            return mid; // return array index of search term
        } else if (term < array[mid]) { // search term is smaller than mid point value
            // right bound = mid - 1;
            return binarySearchRecursive(array, term, left, mid - 1); // set right bound
        } else {
            // left bound = mid + 1;
            return binarySearchRecursive(array, term, mid + 1, right); // set left bound
        }
    }
}

