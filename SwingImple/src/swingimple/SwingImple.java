package swingimple;

import java.util.Scanner;

public class SwingImple
{
    public static void main(String[] args)
    {
        System.out.println("Creating an Object of SwingDemo...");
        SwingDemo obj = null;
        obj = new SwingDemo();
        System.out.println("Enter Title of the Window..");
        Scanner s = new Scanner(System.in);
        String title=s.nextLine();
        System.out.println("Enter Matter");
        String matter=s.nextLine();
        SwingDemo obj1 = new SwingDemo(title,matter);
        
    }
    
}
