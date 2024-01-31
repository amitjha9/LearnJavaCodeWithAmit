package LearnStringCode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromString {


    public List<String> getTotalSubstring(String input)
    {
        List<String> data = new ArrayList<>();
        String sub = "";
        for(int i=0; i<input.length(); i++)
        {
            sub = "";
            for(int j=i; j<input.length(); j++)
            {
                sub = sub+input.charAt(j);
                data.add(sub);
            }
        }
        return data;
    }

    public List<String>  getListPalindrom(List<String> totalCount)
    {
        List<String> totalPalin = new ArrayList<>();
        String rev = "";
        for(int i=0; i<totalCount.size(); i++)
        {
            String current = totalCount.get(i);

            StringBuilder br = new StringBuilder(current);
            rev = br.reverse().toString();
            if(rev.equalsIgnoreCase(current))
            {
                totalPalin.add(current);
            }
        }
        return totalPalin;
    }


    public String getLongest(List<String> input)
    {
        String longest = "";
        int max = 0;
        for(int i=0; i<input.size(); i++)
        {
            int length = (input.get(i)).length();
            if(length>max)
            {
                max = length;
                longest = input.get(i);
            }
        }

        return longest;
    }


    public static void main(String args[])
    {
        String input = "abc";
        LongestPalindromString longestPalindromString = new LongestPalindromString();
        List<String> totalSub = longestPalindromString.getTotalSubstring(input);
        //System.out.println("Total SubString Count:" +totalSub);
        List<String> result = longestPalindromString.getListPalindrom(totalSub);
        //System.out.println("Total Palindrom found:"+result);

        String longPalin = longestPalindromString.getLongest(result);
        System.out.println("Longest Palindromic String is:" +longPalin);
    }
}
