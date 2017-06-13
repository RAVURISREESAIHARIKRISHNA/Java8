package funcwithobjpara;

import java.util.Scanner;
import java.lang.System;
class Test
{
    protected int a;
    protected int b;
    
    public Test()
    {
        System.out.println("Default Constructor Called");
    }

    public Test(int a, int b) 
    {
        System.out.println("Values Initialized by Parametrized Constructor");
        this.a = a;
        this.b = b;
        this.display();
    }
    
    public void init(Test obj1)
    {
        this.a = obj1.a;
        this.b = obj1.b;
        System.out.println("Values Initialized by Passing Objects");
        this.display();
        
    }
    public void change(Test obj1)//Object passing is always Call By Reference
    {
        obj1.a*=2;
        obj1.b*=2;
        this.display();
    }
    public void display()
    {
        System.out.println("*************");
        System.out.printf("Value of a is %d\nValue of b is %d\n",this.a,this.b);
        System.out.println("*************");
    }
}
public class FuncWithObjPara
{
    public static void main(String arg[])
    {
        System.out.println("Enter a and b values for Manual initilization");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Test obj = new Test(a,b);
        System.out.println("Initilizing another object with the same Values of the previous object");
        Test obj1;
        obj1 = new Test();
        obj1.init(obj);
        obj1.change(obj1);
        
    }
}