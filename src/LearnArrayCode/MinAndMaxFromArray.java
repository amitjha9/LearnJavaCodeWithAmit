package LearnArrayCode;

public class MinAndMaxFromArray {


    //Using sort approach
    public void getSolution(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] +" ");
        }

        //Min and Max is
        System.out.println("\n");
        System.out.println("Min is:" +a[a.length-1] + " Max is:" +a[0]);
    }


    public void getOutput(int a[])
    {
       if(a==null || a.length==0)
       {
           return;
       }
       int min = a[0];
       int max = a[0];
       for(int i=1; i<a.length; i++)
       {
           if(a[i]<min)
           {
               min = a[i];
           }
           if(a[i]>max)
           {
               max = a[i];
           }
       }
        System.out.println("Min:" +min+ " Max:" +max);
    }


    public static void main(String[] args)
    {
        int a[] = {10,25,14,18,26,45,39};
        MinAndMaxFromArray minAndMaxFromArray = new MinAndMaxFromArray();
        minAndMaxFromArray.getSolution(a);
        minAndMaxFromArray.getOutput(a);
    }
}
