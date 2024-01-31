package LearnArrayCode;

import java.util.Arrays;

public class GetKthHighestFromArray {

    public void getOutPut(int a[], int k)
    {
        Arrays.sort(a);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int last = (a.length);
        System.out.println("Kth element is:" +a[last-k]);
    }

    public void getSortedArray(int a[])
    {
        System.out.println("Array before sorting");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Sorting normal approach
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nArray after sorting");
        for(int k=0; k<a.length; k++)
        {
            System.out.print(a[k] + " ");
        }
    }

    public void countDuplicate(int a[])
    {
        int max = 0;
        int count = 1;
        int num = 0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(max<count)
            {
                max = count;
                num = a[i];
                count = 1;
            }
        }
        System.out.println("Max duplicate:" +num);
    }

    public static void main(String[] args) {

        int a[] = {10, 5, 25, 13, 18, 11, 14, 10, 25, 25, 13, 88, 13, 95, 13, 48, 13, 15, 13, 25};
        GetKthHighestFromArray getKthHighestFromArray = new GetKthHighestFromArray();
        int k=2;
        getKthHighestFromArray.countDuplicate(a);
    }
}
