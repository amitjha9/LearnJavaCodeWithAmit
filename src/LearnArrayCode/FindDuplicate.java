package LearnArrayCode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {


    public List<Integer> getOutput(int a[])
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> duplicate = new ArrayList<>();
        for(int i=0; i<a.length; i++)
        {
            if(!list.contains(a[i]))
            {
                list.add(a[i]);
            }
            else
            {
                if(!duplicate.contains(a[i]))
                {
                    duplicate.add(a[i]);
                }
            }
        }
        return duplicate;
    }

    public static void main(String args[])
    {
        int a[] = {7,15,8,15,7,7,7,15,20,25,8,8,8};
        FindDuplicate findDuplicate = new FindDuplicate();
        List<Integer> output = findDuplicate.getOutput(a);
        if(output.isEmpty())
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(output);
        }
    }
}
