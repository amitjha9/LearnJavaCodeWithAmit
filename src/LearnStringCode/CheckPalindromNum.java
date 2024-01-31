package LearnStringCode;

public class CheckPalindromNum {

    public boolean checkPalindromNum(int num)
    {
        boolean flag = false;
        int sum = 0;
        int rem = 0;
        int temp = num;
        while (num>0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }

        if(sum==temp)
        {
            flag=true;
        }
        return  flag;
    }

    public static void main(String args[])
    {
        int num = 34543;
        CheckPalindromNum checkPalindromNum = new CheckPalindromNum();
        boolean check = checkPalindromNum.checkPalindromNum(num);
        if(check)
        {
            System.out.println("Given num is palindrom");
        }
        else
        {
            System.out.println("Given num is not palindrom");
        }
    }
}
