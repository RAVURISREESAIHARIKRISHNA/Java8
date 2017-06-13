package stack;

import static java.lang.System.exit;
import java.util.Scanner;

public class StackImple
{
    public static void main(String arg[])
    {
        System.out.println("Do you want to enter Size or go with Fixed Size?\n1.YES\n2.NO");
        int op;
        Scanner s = new Scanner(System.in);
        op = s.nextInt();
        if(!(op==1||op==2))
        {
            System.out.println("Option Error!!!");
            exit(0);
        }
        Stack obj;
        if(op==1)
            obj = new Stack();
        else
        {
            System.out.println("Enter Size");
            obj = new Stack(s.nextInt());
        }
        while(true)
        {
            System.out.println("******** MENU *********");
            System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.IS EMPTY\n5.IS FULL\n6.EXIT");
            System.out.println("Enter your choice...");
            op = s.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Enter the NUmber");
                    obj.push(s.nextInt());
                    break;
                case 2:
                    int h = obj.pop();
                    if(h==-1)
                    {
                        System.out.println("STACK UNDERFLOW");
                        break;
                    }
                    else
                    {
                        System.out.println(h+" Was Popped out");
                        break;
                    }
                case 3:
                    obj.display();
                    break;
                case 4:
                    if(obj.isEmpty()==1)
                    {
                        System.out.println("YES");
                        break;
                    }
                    else
                    {
                        System.out.println("NO");
                        break;
                    }
                case 5:
                    if(obj.isFull()==1)
                    {
                        System.out.println("YES");
                        break;
                    }
                    else
                    {
                        System.out.println("NO");
                        break;
                    }
                case 6:
                    exit(0);
                default:
                    System.out.println("Wrong OPtion\nTRY AGAIN!!!!!!!!!!");
            }
        }
    }
}