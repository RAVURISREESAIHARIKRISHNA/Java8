package stackdemo;

import static java.lang.System.exit;
import java.util.Scanner;

public class StackDemo
{
    public static void main(String arg[])
    {
        System.out.println("Enter the Size");
        int SIZE,ch,x;
        Scanner s = new Scanner(System.in);
        SIZE = s.nextInt();
        Stack obj = new Stack(SIZE);
        while(true)
        {
            System.out.println("MENU");
            System.out.println("1.PUSH");
            System.out.println("POP");
            System.out.println("3.Display");
            System.out.println("Exit");
            System.out.println("Enter your Choice");
            ch = s.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the Element");
                    x = s.nextInt();
                    obj.push(x);
                    break;
                case 2:
                    x = obj.pop();
                    if(x==-1)
                    {
                        System.out.println("Underflow Occured");
                        break;
                    }
                    else
                    {
                        System.out.println(x+" Popped");
                        break;
                    }
                case 3:
                    obj.display();
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}