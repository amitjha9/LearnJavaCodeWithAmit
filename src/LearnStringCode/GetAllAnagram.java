package LearnStringCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllAnagram {


    //Method to findout the list of all possible substring from a given string
    public List<String> getAllPossibleSubString(String input)
    {
        List<String> data = new ArrayList<>();
        for(int i=0; i<input.length(); i++)
        {
            String sub = "";
            for(int j=i; j<input.length(); j++)
            {
                sub = sub+input.charAt(j);
                data.add(sub);
            }
        }
        return data;
    }

    public boolean getAllPossibleAnangram(String input,List<String> list)
    {
        String data = "";
        boolean flag = false;
        boolean check = false;
        input = input.toLowerCase();
        char a[] = input.toCharArray();
        List<String> anaList = new ArrayList<>();
        for(int i=0; i<list.size(); i++)
        {
            data = list.get(i);
            data = data.toLowerCase();
            char b[] = data.toCharArray();
            if(a.length!=b.length)
            {
                flag = check;
            }
            else
            {
                Arrays.sort(a);
                Arrays.sort(b);
                check = Arrays.equals(a,b);
                if(check)
                {
                    anaList.add(data);
                    flag = check;
                }
            }
        }
        System.out.println("All Possible Anagram from a given string is:"+anaList);
        return flag;
    }

    public static void main(String args[])
    {
        String input = "cbaebabacd";
        String in = "abc";
        GetAllAnagram getAllAnagram = new GetAllAnagram();
        List<String> allPossibleAnangram = getAllAnagram.getAllPossibleSubString(input);
        getAllAnagram.getAllPossibleAnangram(in,allPossibleAnangram);
    }
}
