package LearnStringCode;

import java.util.Arrays;

public class CheckAnagramUsingArrays {

    public boolean checkAnagram(String input1, String input2)
    {
        boolean flag = false;
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        char a[] = input1.toCharArray();
        char b[] = input2.toCharArray();

        if(a.length!=b.length)
        {
            return flag;
        }
        else
        {
            Arrays.sort(a);
            Arrays.sort(b);
            boolean check = Arrays.equals(a,b);
            flag = check;
        }
        return flag;
    }

    public static void main(String args[])
    {
        String input1 = "Earth";
        String input2 = "threA";
        CheckAnagramUsingArrays checkAnagramUsingArrays = new CheckAnagramUsingArrays();
        boolean isAna=checkAnagramUsingArrays.checkAnagram(input1,input2);
        if(isAna)
        {
            System.out.println("Given string are anagram");
        }
        else {
            System.out.println("Given string are not anagram");
        }
    }
}
