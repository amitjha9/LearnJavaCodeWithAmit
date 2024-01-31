package LearnCollection;

import java.util.*;

public class ReturnMaxAndMinStringByMap {


    public void getSolution(String input)
    {
        Map<String,Integer> hashMap = new HashMap<>();
        String data[] = input.split(" ");
        for(int i=0; i<data.length; i++)
        {
            if(!hashMap.containsKey(data[i]))
            {
                hashMap.put(data[i],data[i].length());
            }
            else
            {
                hashMap.put(data[i],1);
            }
        }


        //Print the map based on value sorted
        List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()- o1.getValue();
            }
        });

        System.out.println("Sorted Value");
        int max = 0;
        String maxLength = "";
        for (Map.Entry<String,Integer> entry: list)
        {
            int val = entry.getValue();
            if(val>max)
            {
                max = val;
                maxLength = entry.getKey();
                System.out.println(maxLength);
            }
        }
    }

    public static void main(String[] args)
    {
        String input = "hi amit how are youwhere is your home";
        ReturnMaxAndMinStringByMap test = new ReturnMaxAndMinStringByMap();
        test.getSolution(input);
    }
}
