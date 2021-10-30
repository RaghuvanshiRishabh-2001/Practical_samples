import java.io.*;
   
class sumof{
   
    // Function to calculate the following series
    static double Series(int n)
    {
	
        int i;
        double sums = 0.0, ser;
        for (i = 1; i <= n; ++i) {
            ser = 1 / Math.pow(i, i);
            sums += ser;
        }
        return sums;
    }
   
    // Driver Code
    public static void main(String[] args)
    {
	int n = Integer.parseInt(System.getenv("num"));
       
        double res = Series(n);
        res = Math.round(res * 100000.0) / 100000.0;
        System.out.println("The sum of the series till the given  "+n+"th term is "+res);
    }
}
