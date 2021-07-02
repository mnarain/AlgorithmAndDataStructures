package sr.unasat.ad.recursion.exercise;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        mobilePhoneList.add(new MobilePhone("Samsung", "S7 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S8"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S8 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S9"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S9 Edge"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S10"));
        mobilePhoneList.add(new MobilePhone("Samsung", "S10 Edge"));
        MobilePhone mobilePhoneSearch = new MobilePhone("Samsung", "S10 Edge");

        MobilePhone[] mobilePhones = mobilePhoneList.toArray(new MobilePhone[0]);
        RecursionService rs = new RecursionService();
        rs.binarySearchRecursive(mobilePhones, mobilePhoneSearch,0,(mobilePhones.length - 1));


    }
}
