package LearnArrayCode;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingChar {


    public void getSolution(String input[], char ch)
    {
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<input.length; i++)
        {
            String test = input[i];
            char data[] = test.toCharArray();
            for(int j=0; j<data.length; j++)
            {
                if(data[j]==ch)
                {
                    index = i;
                    list.add(index);
                    break;
                }
            }
        }

        System.out.println("Index:" +list);
    }


    public static void main(String[] args)
    {
        String words[] = {"abc","bcd","aaaa","cbc"};
        char ch = 'a';
        WordsContainingChar wordsContainingChar = new WordsContainingChar();
        wordsContainingChar.getSolution(words,ch);
    }
}
