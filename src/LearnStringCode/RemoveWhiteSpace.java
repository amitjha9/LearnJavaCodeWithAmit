package LearnStringCode;

public class RemoveWhiteSpace {

    public String getOutput(String input)
    {
        String result = "";
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isWhitespace(ch[i]))
            {
                result = result+"";
            }
            else
            {
                result = result+ch[i];
            }
        }

        return result;
    }


    public static void main(String args[])
    {
        String input = "Am i t";
        RemoveWhiteSpace removeWhiteSpace = new RemoveWhiteSpace();
        String output =removeWhiteSpace.getOutput(input);
        System.out.println("Output:" +output);
    }
}
