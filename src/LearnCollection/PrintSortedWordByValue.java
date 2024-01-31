package LearnCollection;

import java.util.*;

public class PrintSortedWordByValue {

    public  void getOutPut(String input)
    {
        String str[] = input.split(" ");
        Map<String, Integer> data = new HashMap<>();

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
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(data.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()- o1.getValue();
            }
        });

        System.out.println("Map in sorted Value");
        for (Map.Entry<String,Integer> entry:list
             ) {
            System.out.println("Key:" +entry.getKey()+ " Value: " +entry.getValue());
        }
    }

    public static void main(String[] args) {

        String test = "apple mango banana mango apple banana papaya mango grapes mango mango apple papaya";
        PrintSortedWordByValue printSortedWordByValue = new PrintSortedWordByValue();
        printSortedWordByValue.getOutPut(test);
    }
}
