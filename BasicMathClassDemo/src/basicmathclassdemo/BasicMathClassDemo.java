package basicmathclassdemo;

import java.util.Scanner;

public class BasicMathClassDemo
{
    public static void main(String args[])
    {
        System.out.println("Enter a Number to get it's Absolute value");
        double x;
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        System.out.println("The Absolute Value of "+x+" is "+Math.abs(x));
        System.out.println("Enter Two Numbers,So that we can Display the Minimum");
        double y;
        x = s.nextDouble();
        y = s.nextDouble();
        System.out.println("The Minimum of "+x+" and "+y+" is "+Math.min(x,y));
        System.out.println("While The maximum is "+Math.max(x,y));
        System.out.println("Enter a Number so that we can round it off for you!!");
        x = s.nextDouble();
        System.out.println("The rounded value of "+x+" is "+Math.round(x));
        System.out.println("Enter Base");
        x = s.nextDouble();
        System.out.println("Enter Exponent");
        y = s.nextDouble();
        System.out.println("Well you have been waiting for "+Math.pow(x, y));
        System.out.println("Finally here are some Random Numbers!!");
        for(int i=0 ;i<=9;i++)
        {
            System.out.println(Math.round(Math.random()*100));
        }
    }
}
