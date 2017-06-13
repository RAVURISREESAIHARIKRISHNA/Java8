package dynamicdispatchimpe;

public class DynamicDispatchImpe
{
    public static void main(String arg[])
    {
        A a;
        B b;
        C c;
        
        a = new A();
        a.display();
        
        a = new B();
        a.display();
        
        a = new C();
        a.display();
    }
}
