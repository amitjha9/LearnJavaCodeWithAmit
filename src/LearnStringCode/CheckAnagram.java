package LearnStringCode;

public class CheckAnagram {


    public boolean checkAnagram(String input1, String input2)
    {
        boolean check = false;
        char ch1[] = input1.toCharArray();
        char ch2[] = input2.toCharArray();
        System.out.println("Ch1 Length:" +ch1.length);
        System.out.println("Ch2 Length:" +ch2.length);
        if(ch1.length!=ch2.length)
        {
            return check;
        }
        for(int i=0; i<ch1.length; i++)
        {
            for(int j=0; j<ch2.length; j++)
            {
                if(ch1[i]==ch2[j])
                {
                    check = true;
                    break;
                }
                else {
                    check = false;
                }
            }
        }
        return check;
    }

    public static void main(String args[])
    {
        String input1 = "Heart";
        String input2 = "Earth";

        input1.toLowerCase();
        input2.toLowerCase();

        CheckAnagram checkAnagram = new CheckAnagram();
        boolean isAnagram=checkAnagram.checkAnagram(input1,input2);
        if(isAnagram)
        {
            System.out.println("Given string is anangram");
        }
        else
        {
            System.out.println("Given string is not anagram");
        }
    }
}
