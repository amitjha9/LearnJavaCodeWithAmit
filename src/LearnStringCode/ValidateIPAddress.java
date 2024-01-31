package LearnStringCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {


    public boolean isValidIP(String input)
    {
        boolean check=false;
        String ip[] = input.split("\\.");
        if(ip.length!=4)
        {
            System.out.println("Sorry invalid length");
            return check;
        }
        else
        {
            //Check if any special character is present
            for(int i=0; i<ip.length; i++)
            {
                check = false;
                boolean isAnySpec=checkSpecial(ip[i]);
                if(isAnySpec)
                {
                    return check;
                }

                //Check if not digit and string is going
                boolean isNotDigit = checkIFNotDigit(ip[i]);
                if (isNotDigit)
                {
                    return check;
                }
                if(Integer.parseInt(ip[i])>=0 && Integer.parseInt(ip[i])<=255)
                {
                    check = true;
                }
                else
                {
                    return check;
                }
            }
        }
        return check;
    }

    public boolean checkSpecial(String input)
    {
        boolean flag;
        Pattern p = Pattern.compile("[^a-zA-Z0-9]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        flag=m.find();
        if(flag)
        {
            flag = true;
        }
        return flag;
    }

    public boolean checkIFNotDigit(String input)
    {
        boolean flag = false;
        for(int i=0; i<input.length(); i++)
        {
            if(!Character.isDigit(input.charAt(i)))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String args[])
    {
        String input = "127.121.111.267";
        ValidateIPAddress validateIPAddress = new ValidateIPAddress();
        boolean isValid=validateIPAddress.isValidIP(input);
        if(isValid)
        {
            System.out.println("Valid IP");
        }
        else
        {
            System.out.println("Invalid IP");
        }
    }
}
