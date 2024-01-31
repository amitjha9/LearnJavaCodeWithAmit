package LearnStringCode;

import java.util.ArrayList;
import java.util.List;

public class PutAnagramTogether {


    public void getOutput(String[] input)
    {
        List<String> list = new ArrayList<>();
        for(int i=0; i<input.length; i++)
        {
            for(int j=i+1; j<input.length; j++)
            {
                String test1 = input[i];
                String test2 = input[j];
                boolean isAnaCheck = checkAnagram(test1,test2);
                if(isAnaCheck)
                {
                    if(!list.contains(test1))
                    {
                        list.add(test1);
                    }
                    if(!list.contains(test2))
                    {
                        list.add(test2);
                    }
                }
            }
        }
        System.out.println(list);
    }

    public boolean checkAnagram(String input1, String input2)
    {
        boolean flag = false;
       input1 = input1.toLowerCase();
       input2 = input2.toLowerCase();
       if(input1.length()!=input2.length())
       {
           return flag;
       }
       else
       {
           char[] a = input1.toCharArray();
           char[] b = input2.toCharArray();
           for(int i=0; i<a.length; i++)
           {
               for(int j=0; j<b.length; j++)
               {
                   if(a[i]==b[j])
                   {
                       flag = true;
                   }
               }
           }
       }
       return flag;
    }


    public static void main(String args[])
    {
        String[] input = {"act","god","cat","dog","tac"};
        PutAnagramTogether putAnagramTogether = new PutAnagramTogether();
        putAnagramTogether.getOutput(input);
    }
}
