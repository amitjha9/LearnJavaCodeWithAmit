package LearnStringCode;

import java.util.*;

public class PrintUnique {


    public String getOutput(String input)
    {
        String output = "";
        Set<Character> data = new LinkedHashSet<>();
        for(int i=0; i<input.length(); i++)
        {
            if(!data.contains(input.charAt(i)))
            {
                data.add(input.charAt(i));
            }
        }
        List<Character> list = new ArrayList<>(data);
        for(int i=0; i<list.size(); i++)
        {
            output = output+list.get(i);
        }

        return output;
    }


    public void withOutHashSet(String input)
    {
        char ch[] = input.toCharArray();
        String output = "";
        List<Character> list = new ArrayList<>();
        for(int i=0; i<ch.length; i++)
        {
            if(!list.contains(ch[i]))
            {
                list.add(ch[i]);
            }
        }
        for(int i=0; i<list.size(); i++)
        {
            output = output+list.get(i);
        }
        System.out.println(output);
    }

    public static void main(String args[])
    {
        String input = "geeksforgeeks";
        PrintUnique printUnique = new PrintUnique();
        //String output= printUnique.getOutput(input);
        //System.out.println(output);

        printUnique.withOutHashSet(input);
    }
}
