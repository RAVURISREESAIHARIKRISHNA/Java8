package returnobj;

class Test
{
    int a;
    
    Test(){}//Default Constructor..As there is a Parameterized Constructor..To Satisfy The Compiler
    Test(int a)
    {
        this.a=a;
    }
    
    Test Manipulate()
    {
        Test temp = new Test();
        temp.a=this.a+10;
        return temp;
    }
    void Display()
    {
        System.out.println("The Value is "+this.a);
    }
    
}
public class ReturnOBJ 
{
    public static void main(String s[])
    {
        Test A = new Test(7);
        Test B;//This Does'nt point to any Object Address
        B = A.Manipulate();
        A.Display();
        B.Display();
        
    }
    
}
