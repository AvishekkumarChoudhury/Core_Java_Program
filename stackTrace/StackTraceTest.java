import java.util.*;
public class StackTraceTest 
{
    /**
     * Computes the factorial of a number
     */

     public static int factorial(int n) 
    {
        System.out.println("factorial (" +n + ")");
        Throwable t=new Throwable();
        StackTraceElement[] frames=t.getStackTrace();
        System.out.println(f);
        int r;
        if(n<=1) r=1;
        else r=n*factorial(n-1);
        System.out.println("return" +r);
        return r;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        factorial(n);


    }
}
