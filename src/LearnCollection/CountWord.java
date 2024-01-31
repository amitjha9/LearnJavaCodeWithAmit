package LearnCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountWord {

    public void getOutPut(String input)
    {
        String[] test = input.split(" ");
        Map<String,Integer> word = new HashMap<>();

        for(int i=0; i<test.length; i++)
        {
            if(word.containsKey(test[i]))
            {
                word.put(test[i],word.get(test[i])+1);
            }
            else
            {
                word.put(test[i],1);
            }
        }

        //Print the Map
        Set<Map.Entry<String, Integer>> entry = word.entrySet();
        Iterator<Map.Entry<String,Integer>> itr = entry.iterator();

        while (itr.hasNext())
        {
            Map.Entry<String,Integer> data = itr.next();
            System.out.println("Key: " +data.getKey()+ " Value: " +data.getValue());
        }
    }

    public static void main(String[] args) {

        String test = "apple orange apple apple garpes papaya orange apple papaya";
        CountWord countWord = new CountWord();
        countWord.getOutPut(test);
    }
}
