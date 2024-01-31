package LearnStringCode;

public class AlternativeString {


    public String getOutPut(String input)
    {
        String result = "";
        String data[] = input.split(" ");
        result = result+data[0];
        for(int i=2; i<data.length; i=i+2)
        {
            result = result+ " " +data[i];
        }

        return  result;
    }

    public static void main(String args[])
    {
        String input = "Amit Kumar Jha is too smart person";
        AlternativeString alternativeString = new AlternativeString();
       String output = alternativeString.getOutPut(input);
        System.out.println("Output:" +output);
    }
}
