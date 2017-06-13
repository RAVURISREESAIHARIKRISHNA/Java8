package linkedlistdemo;

import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        System.out.println("Creating a Lined List with Default Constructor...");
        LinkedListClass obj;
        LinkedList<Integer> o;
        obj = new LinkedListClass();
        int option = 0;
        int x = 0;
        int pos = 0;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println("********* MENU ***************");
            System.out.println("1. ADD Elemnt at Last");//ADD(e)
            System.out.println("2. ADD Element at Pos x");//ADD(e , x)
            System.out.println("3. DELETE Elemnt at Last");//DEL()
            System.out.println("4. DELETE Element at Beg");//DEL(x) x=0
            System.out.println("5. DELETE Element at Pos x");//DEL( x )
            System.out.println("6. ADD ANOTHER LinkedLIst");//AddColl()
            System.out.println("7. REMOVE Except a Collection");//RemoveAll( c )
            System.out.println("8. CLEAR ALL");//Clear()
            System.out.println("9. Check HWeher an Integer Contains..?");//Contains( x )
            System.out.println("10. Display First Element");
            System.out.println("11. Display Last Element");
            System.out.println("12. Display the SIZE of the LinkedList");
            System.out.println("13. Display the ENITRE LinkedList");
            System.out.println("14. Display after SORTING the LinkedList");
            System.out.println("15. EXIT");
            System.out.println("\n\nENTER YOUR OPTION....");

            try
            {
                option = s.nextInt();
            } catch (java.util.InputMismatchException e)
            {
                System.out.println("Input Mismatch Exception");
                continue;
            }
            switch (option)
            {
                case 1:
                    try
                    {
                        x = s.nextInt();
                    } catch (java.util.InputMismatchException e)
                    {
                        break;
                    }
                    obj.Add(x);
                    break;
                case 2:
                    x = pos = 0;
                    try
                    {
                        x = s.nextInt();
                        pos = s.nextInt();
                    } catch (java.util.InputMismatchException e)
                    {
                        break;
                    }
                    obj.Add(pos, x);
                    break;
                case 3:
                    obj.Del();
                    break;
                case 4:
                    obj.Del(0);
                    break;
                case 5:
                    pos = 0;
                    try
                    {
                        pos = s.nextInt();
                    } catch (Exception e)
                    {
                        break;
                    }
                    obj.Del(pos);
                    break;
                case 6:
                    obj.AddColl();
                    break;
                case 7:
                    o = new LinkedList<>();
                    for (int i = 0; i < 10; i++)
                    {
                        try
                        {
                            o.add(s.nextInt());
                        } catch (java.util.InputMismatchException e)
                        {
                            break;
                        }
                    }
                    obj.RemoveALL(o);
                    break;
                case 8:
                    obj.Clean();
                    break;
                case 9:
                    x = 0;
                    try
                    {
                        System.out.println("Enter Element");
                        x = s.nextInt();
                    } catch (Exception e)
                    {
                        break;
                    }
                    obj.Contains(x);
                    break;
                case 10:
                    obj.Display(1);
                    break;
                case 11:
                    obj.DisplayLast();
                    break;
                case 12:
                    obj.DisplaySize();
                    break;
                case 13:
                    obj.Display();
                    break;
                case 14:
                    obj.SortAndDisplay();
                    break;
                case 15:
                    exit(0);
                default:
                    System.out.println("TRY AGAIN!!!!");
                    break;

            }

        }
    }
}
