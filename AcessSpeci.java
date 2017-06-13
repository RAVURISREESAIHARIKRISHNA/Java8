package acessspeci;
class Test
{
    private int a;
    private int b;
    int c;//Default Acess Specifier is PUBLIC
    
    
    void Display()
    {
        System.out.println("\nThe Details are:\na = "+a+"\nb = "+b+"\nc = "+c);
    }
    
    void SetData(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
}

class AcessSpeci
{
    public static void main(String a[])
    {
        Test obj;
        obj=new Test();
        obj.SetData(1,2,3);
        obj.Display();
        obj.c=5;//Default is PUblic ,Hence can be modified from Outside...
        obj.Display();
    }
}