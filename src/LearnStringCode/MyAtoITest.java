package LearnStringCode;

public class MyAtoITest {


    public int getOutput(String input)
    {
        int result = 0;
        int sum = 0;
        char ch[] = input.toCharArray();
        if(input.charAt(0)=='-')
        {
            String data = getPositiveNum(input);
            char test[] = data.toCharArray();
            for(int i=0; i<test.length; i++)
            {
                result = Character.getNumericValue(test[i]);
                sum = (sum*10)+result;
            }
            sum = sum*-1;
        }
        else
        {
            for(int i = 0; i< ch.length; i++)
            {
                if(!Character.isDigit(ch[i]))
                {
                    return -1;
                }
                else
                {
                    result = Character.getNumericValue(ch[i]);
                    sum = (sum*10)+result;
                }
            }
        }
        return sum;
    }

    public String getPositiveNum(String input)
    {
        int num = Integer.parseInt(input);
        if(num<0)
        {
            num = num*-1;
            input = Integer.toString(num);
        }
        return input;
    }


    public static void main(String args[])
    {
        String input = "-12";
        MyAtoITest myAtoITest = new MyAtoITest();
        int output = myAtoITest.getOutput(input);
        System.out.println("Output:" +output);
    }
}
