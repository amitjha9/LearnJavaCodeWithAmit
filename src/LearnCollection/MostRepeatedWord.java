package LearnCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MostRepeatedWord {

    public void getOutPut(String input)
    {
        String str[] = input.split(" ");
        Map<String,Integer> data = new HashMap<>();

        for(int i=0; i<str.length; i++)
        {
            if(data.containsKey(str[i]))
            {
                data.put(str[i],data.get(str[i])+1);
            }
            else
            {
                data.put(str[i],1);
            }
        }

        //Traverse
        Set<Map.Entry<String,Integer>> entrySet = data.entrySet();
        Iterator<Map.Entry<String,Integer>> itr = entrySet.iterator();
        int max = 0;
        String key = "";
        while (itr.hasNext())
        {
            Map.Entry<String,Integer> entry = itr.next();
            int val = entry.getValue();
            if(val>max)
            {
                max = val;
                key = entry.getKey();
            }
        }
        System.out.println("Most Repeating Word is:" +key+ " and count is: "+max);
    }

    public static void main(String[] args) {

        String test = "india is best is japan india is also best as india as india is japan japan japan japan japan ";
        MostRepeatedWord mostRepeatedWord = new MostRepeatedWord();
        mostRepeatedWord.getOutPut(test);
    }
}
