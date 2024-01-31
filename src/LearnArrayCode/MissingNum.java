package LearnArrayCode;

public class MissingNum {

    public void getSolution(int a[],int n)
    {
        int maxSum = 0;
        int sum = 0;
        int missingPostive = 0;
        for(int i=0; i<a.length; i++)
        {
            sum = sum+a[i];
        }
        maxSum = (n*(n+1))/2;
        missingPostive = maxSum-sum;
        System.out.println("Missing Num is:" +missingPostive);
    }

    public static void main(String[] args)
    {
        int a[] = {6,1,2,8,3,4,7,10,5};
        int n = 10;
        MissingNum missingNum = new MissingNum();
        missingNum.getSolution(a,n);
    }
}
