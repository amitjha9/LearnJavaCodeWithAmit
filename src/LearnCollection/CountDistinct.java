package LearnCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountDistinct {

    public void getOutPut(String input)
    {
        char ch[] = input.toCharArray();
        Map<Character,Integer> data = new HashMap<>();

        for(int i=0; i<ch.length; i++)
        {
            if(data.containsKey(ch[i]))
            {
                data.put(ch[i],data.get(ch[i])+1);
            }
            else
            {
                data.put(ch[i],1);
            }
        }

        //Traverse
        Set<Map.Entry<Character,Integer>> entrySet = data.entrySet();
        Iterator<Map.Entry<Character,Integer>> itr = entrySet.iterator();
        while (itr.hasNext())
        {
            Map.Entry<Character,Integer> entry = itr.next();
            int getValue = entry.getValue();
            if(getValue==1)
            {
                char key = entry.getKey();
                System.out.println("Unique Char is:" +key);
            }
        }
    }

    public static void main(String[] args) {

        String test = "Geeksforgeeks";
        test = test.toLowerCase();
        CountDistinct countDistinct = new CountDistinct();
        countDistinct.getOutPut(test);
    }
}
