package LearnStringCode;

public class ReverseEachWord {


    public String getOutput(String input)
    {
        String result = "";
        String data[] = input.split("\\.");
        for(int i=0; i<data.length; i++)
        {
            if(i==0)
            {
                String reverse = getReverseString(data[i]);
                result = result+reverse;
            }
            else
            {
                String reverse = getReverseString(data[i]);
                result = result+"."+reverse;
            }

        }
        return result;
    }

    public String getReverseString(String input)
    {
        String rev = "";
        if(rev.length()==1)
        {
            rev = input;
        }
        else
        {
            StringBuffer br = new StringBuffer(input);
            rev=br.reverse().toString();
        }
        return rev;
    }

    public static void main(String args[])
    {
        String input = "pqr.mno";
        ReverseEachWord reverseEachWord = new ReverseEachWord();
        String output = reverseEachWord.getOutput(input);
        System.out.println("Output:" +output);
    }
}
