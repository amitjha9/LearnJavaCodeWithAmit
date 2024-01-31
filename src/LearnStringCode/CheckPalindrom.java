package LearnStringCode;

public class CheckPalindrom {

    public boolean checkPalindrom(String input)
    {
        boolean flag = false;
        String reverse = "";
        input = input.toLowerCase();
        for(int i=input.length()-1; i>=0; i--)
        {
            reverse = reverse+input.charAt(i);
        }
        if(reverse.equals(input))
        {
            flag = true;
        }
        return  flag;
    }

    public static void main(String args[])
    {
        String input = "abbba";
        CheckPalindrom checkPalindrom = new CheckPalindrom();
        boolean isPalin = checkPalindrom.checkPalindrom(input);
        if(isPalin)
        {
            System.out.println("Givem string is palindrom");
        }
        else {
            System.out.println("Given string is not palindrom");
        }
    }
}
