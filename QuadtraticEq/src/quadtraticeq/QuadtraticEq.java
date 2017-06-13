package quadtraticeq;

import java.util.Scanner;

public class QuadtraticEq
{
    public static void main(String arg[])
    {
        Double a,b,c;
        System.out.println("Enter Co-efficient of X^2");
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        System.out.println("Enter Co-efficient of X");
        b = s.nextDouble();
        System.out.println("Enter Co-efficient of Const");
        c = s.nextDouble();
        
        Quadratic obj = new Quadratic(a,b,c);
        if(obj.feasible())
        {
            Double sol[] = obj.solution();
            for(int i=0;i<=1;i++)
                System.out.print(sol[i]+"\t");
        }
        else
        {
            System.out.println("Imaginary Solution");
            System.exit(0);
        }
    }
}
