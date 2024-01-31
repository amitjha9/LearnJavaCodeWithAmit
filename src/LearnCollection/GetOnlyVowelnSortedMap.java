package LearnCollection;

import java.util.*;

public class GetOnlyVowelnSortedMap {

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
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(data.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()- o1.getValue();
            }
        });

        System.out.println("Sorted vowel");
        for (Map.Entry<Character,Integer> entry:list
             ) {
            char key = entry.getKey();
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u')
            {
                System.out.println("Key:" +entry.getKey()+ " Value: " +entry.getValue());
            }
        }
    }

    public static void main(String[] args) {

        String test = "bananaeie";
        GetOnlyVowelnSortedMap getOnlyVowelnSortedMap = new GetOnlyVowelnSortedMap();
        getOnlyVowelnSortedMap.getOutPut(test);
    }
}
