package LearnStringCode;

public class FindFirstRepeating {


    public String getOutput(String input)
    {
        String output = "";
        int count =1;
        char a[] = input.toCharArray();
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                    if(count>1)
                    {
                        output = Character.toString(a[j]);
                        return output;
                    }
                }
            }

        }
        return "-1";
    }

    public static void main(String args[])
    {
        String input = "hello";
        FindFirstRepeating findFirstRepeating = new FindFirstRepeating();
        String result=findFirstRepeating.getOutput(input);
        System.out.println(result);
    }
}
