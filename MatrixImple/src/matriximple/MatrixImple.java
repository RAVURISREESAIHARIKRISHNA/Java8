package matriximple;

import java.util.Scanner;

public class MatrixImple
{
    public static void main(String arg[])
    {
        System.out.println("Enter order of A");
        int am,an,bm,bn;
        Scanner s = new Scanner(System.in);
        try
        {
            am = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You have to enter an integer");
            am = 0;
        }
        
        try
        {
            an = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You have to enter an integer");
            an = 0;
        }
        
        System.out.println("Enter order of B");
        
        try
        {
            bm = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You have to enter an integer");
            bm = 0;
            
        }
        try
        {
            bn = s.nextInt();
        }
        catch(java.util.InputMismatchException obj)
        {
            System.out.println("You have to enter an integer");
            bn = 0;
            
        }
        
        Matrix obj = new Matrix(am,an,bm,bn);
        Double add[][] = obj.add();
        Double mul[][] = obj.product();
        
        for(int  i=0;i<=am-1;i++)
        {
            for(int j=0;j<=bn-1;j++)
                System.out.print(mul[i][j]);
            System.out.println();
        }
        
        for(int  i=0;i<=am-1;i++)
        {
            for(int j=0;j<=an-1;j++)
                System.out.print(add[i][j]);
            System.out.println();
        }
        
        //Similarly we can Take matrices here and pass them.  to the constructor
        
    }
        
}
