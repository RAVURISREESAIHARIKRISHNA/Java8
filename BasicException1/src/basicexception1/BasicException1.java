package basicexception1;
import java.util.Scanner;
public class BasicException1
{
    public static void main(String argp[])
    {
        //By Giving Double num.den... It is not going to Exception block
        //Just printing 
        //The Answer is infinity
        int num,den,ans;
        System.out.println("Enter Numerator :");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("Enter Denominator");
        den = s.nextInt();
        try
        {
            System.out.println("In Try Block");
            ans = num/den;
            System.out.println("The Answer is "+ans);
            System.out.println("Try Block Completed");
        }
        catch (ArithmeticException obj)
        {
            System.out.println("In Catch Block");
            System.out.println("Division By ZERO is not allowed");
            System.out.println("Catch Block completed");
        }
        System.out.println("Back to Main Block");
    }
}
