package LearnCollection;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoList {


    public  void compareTwoList(List<String> list1, List<String> list2)
    {
        if(list1.equals(list2))
        {
             System.out.println("Both the list are equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }

    public static void main(String[] args) {

        List<String> name1 = new ArrayList<>();
        name1.add("Bangalore");
        name1.add("Punjab");
        name1.add("patna");

        List<String> name2 = new ArrayList<>();
        name2.add("Bangalore");
        name2.add("punjab");
        name2.add("patna");

        CompareTwoList compareTwoList = new CompareTwoList();
        compareTwoList.compareTwoList(name1,name2);
    }
}
