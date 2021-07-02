package sr.unasat.ad.recursion.exercise;

public class RecursionService {

    public int binarySearchRecursive(MobilePhone[] mobilePhoneList, MobilePhone searchTerm, int left, int right) {
        if (left > right) {
            System.out.println("Can’t find phone " + searchTerm.getBrand());
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (mobilePhoneList[mid].equals(searchTerm)) { // search term found
   //     if (mobilePhoneList[mid].hashCode() == searchTerm.hashCode()) { // search term found
            System.out.println("Found phone " + searchTerm.getBrand() + " with " + searchTerm.getModelNumber() + " at index " + mid);
            System.out.println(mobilePhoneList[mid]);
            return mid; // return array index of search term
        } else if (searchTerm.getModelNumber().compareTo(mobilePhoneList[mid].getModelNumber()) < 0) { // search term is smaller than mid point value
            // right bound = mid - 1;
            return binarySearchRecursive(mobilePhoneList, searchTerm, left, mid - 1); // set right bound
        } else {
            // left bound = mid + 1;
            return binarySearchRecursive(mobilePhoneList, searchTerm, mid + 1, right); // set left bound
        }
    }

}
