package LearnStringCode;

public class ExtractNumericValue {

    public int getOutput(String input)
    {
        int sum = 0;
        int temp = 0;
        char a[] = input.toCharArray();
        for(int i=0; i<a.length; i++)
        {
            if(Character.isDigit(a[i]))
            {
                sum = (sum*10)+Character.getNumericValue(a[i]);
                if(temp<sum)
                {
                    temp = sum;
                }
            }
            else {
                sum = 0;
            }
        }
        return temp;
    }


    public static void main(String args[])
    {
        String input = "Amit456jh678ku1020ar654jp150";
        ExtractNumericValue extractNumericValue = new ExtractNumericValue();
        int output = extractNumericValue.getOutput(input);
        System.out.println("Maximum Numeric Value in a given string:" +output);
    }
}
