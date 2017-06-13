package abstractclassimple;

import java.util.Scanner;
import java.lang.System;

public class AbstractClassImple
{
    public static void main(String arg[])
    {
        System.out.println("Enter Length of the Figure:");
        Scanner s = new Scanner(System.in);
        Double l = s.nextDouble();
        System.out.println("Enter Breadth of the Figure:");
        Double b = s.nextDouble();
        //We cannot create Object but we can create object reference of the abstract class
        Figure obj = new Rectangle(l,b);
        obj.display();
        System.out.println("Rectangle Are is : "+obj.area());
        obj = new Triangle(l,b);
        obj.display();
        System.out.println("Area of Triangle id : "+obj.area());
        obj = new Square(l,b);
        obj.display();
        System.out.println("Area of Square id : "+obj.area());
    }
}