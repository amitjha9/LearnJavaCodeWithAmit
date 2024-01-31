package LearnArrayCode;

public class CountPairs {


    public void getSolution(int a[], int n)
    {
        int totalSum = 0;
        int count = 0;
        for(int i=0; i<a.length; i++)
        {
            totalSum = a[i];
            for(int j=i+1; j<a.length; j++)
            {
                totalSum = totalSum+a[j];
                if(totalSum==n)
                {
                    count++;
                    totalSum = a[i];
                }
                else
                {
                    totalSum = a[i];
                }
            }
        }
        System.out.println("Total Pair Count:"+count);
    }


    public static void main(String[] args)
    {
        int a[] = {1, 1, 1, 1};
        int n = 2;
        CountPairs countPairs = new CountPairs();
        countPairs.getSolution(a,n);
    }
}
