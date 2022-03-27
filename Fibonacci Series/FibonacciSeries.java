import java.util.*;
public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=in.nextInt();   
        in.close();
        System.out.println("First " + n + " terms of fibonnaci series: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}