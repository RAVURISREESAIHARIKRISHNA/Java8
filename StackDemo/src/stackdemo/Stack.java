package stackdemo;

public class Stack
{
    protected int a[];
    protected int MAX;
    protected int length;
    
    public Stack(int MAX)
    {
        this.MAX = MAX;
        a= new int[this.MAX];
        length = 0;
    }
    
    public void push(int x)
    {
        if(this.length < this.MAX)
        {
            a[this.length]=x;
            this.length++;
            //return;
        }
        else
            System.out.println("Overflow Occcured");
    }
    public int pop()
    {
        if(this.length > 0)
        {
            int val = a[this.length-1];
            this.length-=1;
            return val;
        }
        else
        {
            return -1;
        }
    }
    public void display()
    {
        if(this.length>0)
        {
            System.out.println("\n-----------");
            for(int i=this.length-1;i>=0;i--)
            {
                System.out.println(a[i]);
            }
            System.out.println("\n-----------");
        }
        else
        {
            System.out.println(" Terminated");
        }
    }
}