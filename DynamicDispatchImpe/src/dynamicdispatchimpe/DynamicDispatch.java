package dynamicdispatchimpe;

class A
{
    public A()
    {
        System.out.println("A");
    }
    public void display()
    {
        System.out.println("a.display()");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("B");
        
    }
    public void display()
    {
        System.out.println("b.isplay()");
    }
}
class C extends B
{
    public C()
    {
        System.out.println("C");
    }
    public void display()
    {
        System.out.println("c.display()");
    }
}