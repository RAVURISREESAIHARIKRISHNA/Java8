//import java.util.Scanner;

class Fibanocci
{
    public static void main(String args[])
    {
        double  x=0 ,y=1;
        //System.out.println(x);
        for(int i=1 ; i<=100 ; i++)
        {
           double temp = x;
           y = y+x;
           x = y;
           y = temp;
           System.out.println(y);
        }
    }
}