package LearnStringCode;

import java.util.Stack;

public class ParanthesisCheck {

    public boolean checkValidString(String input)
    {
        Stack<Character> stack = new Stack<>();
        char ch[] = input.toCharArray();

        for(int i=0; i<input.length();i++)
        {
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
            {
                stack.push(ch[i]);
            }
            else
            {
                if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
                {
                   if(stack.isEmpty())
                   {
                       return false;
                   }
                   else
                   {
                      if(ch[i]==']' && stack.peek()!='[')
                      {
                          return false;
                      } else if (ch[i]==')' && stack.peek()!='(') {
                          return false;
                      } else if (ch[i]=='}' && stack.peek()!='{') {
                          return false;
                      }

                      stack.pop();
                   }
                }
            }
        }
        return  stack.isEmpty();
    }


    public static void main(String args[])
    {
        String input = "())((())";
        ParanthesisCheck paranthesisCheck = new ParanthesisCheck();
        boolean isValid = paranthesisCheck.checkValidString(input);
        if(isValid)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
