package LearnArrayCode;

public class SubArrayWithGivenSum {


    //This is brute force approach
    public void getSolution(int a[],int sum)
    {
        int currentSum = 0;
        for(int i=0; i<a.length; i++)
        {
            currentSum = a[i];
            for(int j=i+1; j<a.length; j++)
            {
                currentSum = currentSum+a[j];
                if(currentSum==sum)
                {
                    System.out.println("[" +i+ ","+j+ "]");
                    break;
                }
            }
        }
    }


    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int n = 15;
        SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
        subArrayWithGivenSum.getSolution(a,n);
    }
}
