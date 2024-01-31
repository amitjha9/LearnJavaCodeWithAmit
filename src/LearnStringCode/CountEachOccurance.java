package LearnStringCode;

import java.util.*;

public class CountEachOccurance {

    public void getOutPut(String input)
    {
        Map<Character,Integer> data = new HashMap<>();
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(data.containsKey(ch[i]))
            {
                data.put(ch[i],data.get(ch[i])+1);
            }
            else
            {
                data.put(ch[i], 1);
            }
        }

        //Print the map in sorted manner
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(data.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        System.out.println("Sorted Map");
        for (Map.Entry<Character,Integer> entry: list
             ) {
            System.out.println("Key:" +entry.getKey() +" Value:" +entry.getValue());
        }
    }

    public static void main(String args[])
    {
        String input = "Hello$#worldrdl^%^&.";
        CountEachOccurance countEachOccurance = new CountEachOccurance();
        countEachOccurance.getOutPut(input);
    }
}
