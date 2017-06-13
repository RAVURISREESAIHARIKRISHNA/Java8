package queue;

public class Queue extends stackdemo.Stack
{

    public Queue(int MAX) 
    {
        super(MAX);
    }
    
    @Override
    public int pop()
    {
        if(this.length > 0)
        {
            int val = a[0];
            
            for(int i=1;i<=this.length-1;i++)
                a[i-1]=a[i];
            
            return val;
        }
        else
        {
            return -1;
        }
    }
    
    @Override
    public void display()
    {
        if(this.length>0)
        {
            System.out.println("\n-----------");
            for(int i=this.length-1;i>=0;i--)
            {
                System.out.print(a[i]+"   ");
            }
            System.out.println("\n-----------");
        }
        else
        {
            System.out.println(" Terminated");
        }
    }
    
}