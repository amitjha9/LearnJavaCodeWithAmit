package LearnCollection;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public List<Integer> reverseList(List<Integer> list)
    {
        List<Integer> revList = new ArrayList<>();
        try {
            for(int i= list.size()-1; i>=0; i--)
            {
                int n = list.get(i);
                revList.add(n);
            }
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        return  revList;
    }

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println("Original List:" +num);

        ReverseArrayList reverseArrayList = new ReverseArrayList();
        List<Integer> output = reverseArrayList.reverseList(num);
        System.out.println(output);

    }
}
