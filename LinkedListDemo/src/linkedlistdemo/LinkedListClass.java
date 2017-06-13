package linkedlistdemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListClass
{

    LinkedList<Integer> obj, o;
    Scanner s = new Scanner(System.in);

    public LinkedListClass()
    {
        obj = new LinkedList<>();
    }

    public void Add(int x)
    {
        this.obj.add(x);
    }

    public void Add(int pos, int x)
    {
        this.obj.add(pos, x);
    }

    public void Del()
    {
        int x, y = 0;
        try
        {
            x = this.obj.removeLast();
        } catch (java.util.NoSuchElementException e)
        {
            y = 1;
        }
        if (y == 1)
        {
            System.out.println("No Such Element Found");
        }

    }

    public void Del(int pos)
    {
        int x;
        try
        {
            x = this.obj.remove(pos);
        } catch (java.lang.IndexOutOfBoundsException e)
        {
            System.out.println("Index Out OF Bound Of Exception");
        }
    }

    public void AddColl()
    {
        o = new LinkedList<>();
        System.out.println("Enter Size");
        int size = 0;

        try
        {
            size = s.nextInt();
        } catch (java.util.InputMismatchException e)
        {

        }
        for (int i = 1; i <= size; i++)
        {
            System.out.println("Enter " + i + " Element for New Collection to be addded");
            try
            {
                this.obj.add(s.nextInt());
            } catch (java.util.InputMismatchException e)
            {

            }
        }
        try
        {
            this.obj.addAll(o);
        } catch (java.lang.NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }
    }

    public void Contains(int x)
    {
        boolean a;
        a = this.obj.contains(Integer.valueOf(x));
        System.out.println(a);
    }

    public void Display(int pos)
    {
        try
        {
            System.out.println(this.obj.get(pos));
        } catch (java.lang.IndexOutOfBoundsException e)
        {
            System.out.println("No Such Element");
        }
    }

    public void Display()
    {
        System.out.println(this.obj);
    }

    public void DisplaySize()
    {
        System.out.println(this.obj.size());
    }

    public void SortAndDisplay()
    {
        Integer a[];
        try
        {
            a = this.obj.toArray(new Integer[0]);
        } catch (java.lang.ArrayStoreException e)
        {
            System.out.println("ArrayThrowException");
            return;
        } catch (java.lang.NullPointerException e)
        {
            System.out.println("Null POinter Exception");
            return;
        }
        Arrays.sort(a);
        this.obj.clear();
        this.obj.addAll(Arrays.asList(a));
        this.Display();
    }

    public void RemoveALL(LinkedList<Integer> c)
    {
        try
        {
            this.obj.removeAll(c);
        } catch (java.lang.ClassCastException e)
        {
            System.out.println("Class Cast Exception");
        } catch (java.lang.NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }

    }

    public void Clean()
    {
        this.obj.clear();
    }

    public void DisplayLast()
    {
        try
        {
            System.out.println(this.obj.get(this.obj.size()));
        } catch (java.lang.IndexOutOfBoundsException e)
        {
            System.out.println("No Such Element");
        }
    }
}
