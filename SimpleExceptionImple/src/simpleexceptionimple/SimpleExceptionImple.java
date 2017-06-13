package simpleexceptionimple;

import java.util.Scanner;
import java.lang.System;
import java.lang.ArithmeticException;
import static java.lang.System.exit;

public class SimpleExceptionImple
{
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("Enter Numerator");
        Scanner s = new Scanner(System.in);
        try
        {
            a = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You Should give an integer\nRun program again");
            a=1;//To manage Vaiable initilization problem
            try
            {
                System.exit(0);
            }
            catch(java.lang.SecurityException obj1)
            {
                System.out.println("Security Exception Caught");
            }
        }
        System.out.println("ENter Denominator");
        try
        {
            b = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You Should give an integer\nRun program again");
            b=1;//To manage variable initilization probleml
            try
            {
                System.exit(0);
            }
            catch(java.lang.SecurityException obj1)
            {
                System.out.println("Security exception caught");
            }
            
            }
        try
        {
           
            System.out.println(a/b);
        }
        catch(java.lang.ArithmeticException obj)
        {
            System.out.println("Arithmetic Exception Caught!\nLearn Maths....");
        }
    }
}
