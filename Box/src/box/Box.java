package box;
import java.lang.System;
import java.lang.String;

public class Box
{
    public static void main(String arg[])
    {
        System.out.println("*************AUTOMATIC ENTRY*************");
        BoxSource obj = new BoxSource(5.0,5.0,5.0);
        obj.Display();
        System.out.println("The Surface area is : "+obj.Area());
        System.out.println("The Voulme of the Box is : "+obj.Volume());
        
        System.out.println("********* MANUAL ENTRY ***************");
        obj = new BoxSource();
        System.out.println("Enter the Box Details:");
        obj.EnterData();
        System.out.println("Entered Data is :");
        obj.Display();
        System.out.println("The Surface area is : "+obj.Area());
        System.out.println("The Voulme of the Box is : "+obj.Volume());
        
    }
}