package LearnStringCode;

public class FindMaxAndMinString {

    public void getSolution(String input)
    {
        String data[] = input.split(",");
        for(int i=0; i<data.length; i++)
        {
            String current = data[i];
            getOutput(current);
        }
    }


    public void getOutput(String input)
    {
        String value[] = input.split(" ");
        String maxLength = value[0];
        String minLength = value[0];
        for(int i=1; i<value.length; i++)
        {
            if(value[i].length()>maxLength.length())
            {
                maxLength = value[i];
            }
            if(value[i].length()<minLength.length())
            {
                minLength = value[i];
            }
        }

        System.out.println("Max String:" +maxLength+ " Min String:" +minLength);
    }

    public static void main(String[] args)
    {
        String input = "hi amit how are you,where is your home";
        FindMaxAndMinString findMaxAndMinString = new FindMaxAndMinString();
        findMaxAndMinString.getSolution(input);
    }
}
