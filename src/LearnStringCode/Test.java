package LearnStringCode;

import java.util.Arrays;

public class Test {

    public boolean checkEqual(String s1, String s2)
    {
        boolean flag = false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean check=Arrays.equals(a,b);
        if(check)
        {
            flag = true;
        }
        return flag;
    }


    public static void main(String args[])
    {
        String t1 = "Listen";
        String t2 = "Silent";
        Test test = new Test();
        boolean isCheck=test.checkEqual(t1,t2);
        if(isCheck)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
