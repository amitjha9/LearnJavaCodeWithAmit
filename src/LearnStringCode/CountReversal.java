package LearnStringCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CountReversal {

    public int getData(String input)
    {
        int count = 0;

        Stack<Character> stack = new Stack<>();
        if(input.length()%2==1)
        {
            return -1;
        }
        else
        {
            for(int i=0; i<input.length(); i++)
            {
                if(input.charAt(i) == '}')
                {
                    if(stack.isEmpty())
                    {
                        stack.push('{');
                        count++;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
                else
                {
                    stack.push(input.charAt(i));
                }
            }
        }

        int remain=(stack.size())/2;
        count = count+remain;
        return  count;
    }

        public static void main (String args[])
        {
            String input = "{{{{";
            CountReversal countReversal = new CountReversal();
            int count = countReversal.getData(input);
            System.out.println(count);
        }
}
