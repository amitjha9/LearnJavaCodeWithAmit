package LearnStringCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintDigitFromString {

    public String getOutPut(String input)
    {
        String digit = "";
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                digit = digit+ch[i];
            }
        }
        return digit;
    }

    public String printAllSpecialNumericString(String input)
    {
        String output = "";
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                output = output+ch[i];
            } else if (Character.isLetter(ch[i])) {
                output = output+ch[i];
            }
        }
        return  output;
    }

    public String printAllSpecial(String input)
    {
        input = input.replaceAll("[^a-zA-Z0-9]","");
        return  input;
    }

    public boolean checkSpecialChar(String input)
    {
        boolean flag;
        //Using Pattern ana Matcher class
        Pattern p = Pattern.compile("[^a-zA-Z0-9]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        flag = m.find();
        if(flag)
        {
            flag = true;
        }
        return  flag;
    }

    public static void main(String args[])
    {
        String input = "Amit07ku98ma67rjh55a";
        String request = "Am56t$%^ku67**()jha";
        String strInput = "Hello$#world^%^&.";
        String test = "amit123#";
        PrintDigitFromString printDigitFromString = new PrintDigitFromString();
        String result = printDigitFromString.getOutPut(input);
        String output = printDigitFromString.printAllSpecialNumericString(request);

        boolean isSpecial = printDigitFromString.checkSpecialChar(test);
        System.out.println("Found:" +isSpecial);

        String allSpecial = printDigitFromString.printAllSpecial(strInput);
        System.out.println("Output:" +result);
        System.out.println("Request Output:" +output);
        System.out.println("All Special:" +allSpecial);
    }
}
