package LearnStringCode;

public class AlternateUpperLowerCharSort {

    public String getOutPut(String input)
    {
        String result = "";
        char data;
        char ch[] = input.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isLowerCase(ch[i]))
            {
                data = Character.toUpperCase(ch[i]);
                result = result+data;
            }
            else if(Character.isUpperCase(ch[i]))
            {
                data = Character.toLowerCase(ch[i]);
                result = result+data;
            }
        }
        return  result;
    }


    public static void main(String args[])
    {
        String input = "Amit Kumar Jha";
        AlternateUpperLowerCharSort alternateUpperLowerCharSort = new AlternateUpperLowerCharSort();
        String output = alternateUpperLowerCharSort.getOutPut(input);
        System.out.println("OutPut:" +output);
    }
}
