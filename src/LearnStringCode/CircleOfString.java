package LearnStringCode;

public class CircleOfString {


    public boolean isCircleOfString(String[] input)
    {
        boolean flag = false;
        for(int i=0; i<input.length; i++)
        {
            String data = input[i];
            char last = data.charAt(data.length()-1);
            for(int j=i+1; j<input.length; j++)
            {
                String val = input[j];
                char first = val.charAt(0);
                if(last==first)
                {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String args[])
    {
        String[] input = {"for", "geek", "kaf", "rig"};
        CircleOfString circleOfString = new CircleOfString();
        boolean isCircle=circleOfString.isCircleOfString(input);
        if(isCircle)
        {
            System.out.println("Circle String");
        }
        else
        {
            System.out.println("Not Circle String");
        }
    }
}
