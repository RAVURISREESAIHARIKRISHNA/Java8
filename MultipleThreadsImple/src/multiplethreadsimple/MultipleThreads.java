package multiplethreadsimple;

import static java.lang.Thread.sleep;

public class MultipleThreads implements Runnable
{
    protected String name;
    public Thread t;
    public MultipleThreads(String name)
    {
        this.name = name;
        t = new Thread(this,name);
        try
        {
            t.start();
        }
        catch (java.lang.IllegalThreadStateException e)
        {
            System.out.println("here");
        }
    }
    @Override
    public void run()
    {
        //Thread.currentThread().setName(name);
        System.out.println("My name is : "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" is Alive ?  : "+Thread.currentThread().isAlive());
        int i;
        for (i = 0; i <= 10; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
        try
        {
            sleep(1000);
            if (i==10)
            {
                System.out.println(Thread.currentThread().getName()+" is EXITING");
            }
        }
        catch (java.lang.InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName()+" Interrupted");
            e.printStackTrace();
        }
    }
}