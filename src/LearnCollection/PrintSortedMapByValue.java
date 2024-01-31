package LearnCollection;

import java.util.*;

public class PrintSortedMapByValue {

    public  void getOutPut(String input)
    {
        Map<Character, Integer> data = new HashMap<>();
        char ch[] = input.toCharArray();
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

        //Traverse Using comparator
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(data.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        //Print the Map based on sorted value
        System.out.println("Sorted Value");
        for (Map.Entry<Character,Integer> entry: list)
        {
            System.out.println("Key:" +entry.getKey() +" Value: "+entry.getValue());
        }
    }

    public static void main(String[] args) {

        String test = "Banana";
        PrintSortedMapByValue printSortedMapByValue = new PrintSortedMapByValue();
        printSortedMapByValue.getOutPut(test);
    }
}
