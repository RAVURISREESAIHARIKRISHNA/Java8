package threadrunnableimple;

import static java.lang.Thread.sleep;


public class ThreadRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("This line is being executed by "+Thread.currentThread().getName());
        try 
        {
            sleep(500);
        } catch (java.lang.InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}