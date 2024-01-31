package LearnArrayCode;

public class MaximumProductSubArray {



    public void getSolution(int a[])
    {
        int currentProduct = 1;
        int maxProduct = 1;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i; j<a.length; j++)
            {
                currentProduct = currentProduct*(a[j]);
                if(currentProduct>maxProduct)
                {
                    maxProduct = currentProduct;
                }
            }
        }
        System.out.println("Max Product:" +maxProduct);
    }

    public static void main(String[] args)
    {
        int a[] = {6, -3, -10, 0, 2};
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        maximumProductSubArray.getSolution(a);
    }
}
