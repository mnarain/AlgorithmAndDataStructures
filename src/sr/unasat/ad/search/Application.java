package sr.unasat.ad.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void main(String[] args) {
    //    int[] dataSet = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // String[] data = {"10","20","30","40","50","60","70","80","90","100"};

     /*   int termFoundAtIndex = SearchService.linearSearch(-2, dataSet);

        if (termFoundAtIndex >= 0) {
            System.out.println("De index waar de zoekterm voorkomt is " + termFoundAtIndex);
        } else {
            System.out.println("De zoekterm komt niet voor in de dataset");
        }*/

    //    System.out.println(SearchService.binarySearchIterative(dataSet, 20));

        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        mobilePhoneList.add(new MobilePhone("Samsung", "S7 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S8"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S8 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S9"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S9 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S10"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S10 Edge"));
        MobilePhone searchTerm = new MobilePhone("Samsung", "S8 Edge");
        MobilePhone[] mobilePhones = mobilePhoneList.toArray(new MobilePhone[0]);

        System.out.println(SearchService.linearSearchObject(searchTerm, mobilePhones));

        System.out.println(SearchService.binarySearchIterativeObject(searchTerm, mobilePhones));

    }
}
