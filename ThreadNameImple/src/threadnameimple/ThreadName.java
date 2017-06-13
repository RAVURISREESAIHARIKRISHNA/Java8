package threadnameimple;

public class ThreadName implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("CHOLD : My name is "+Thread.currentThread().getName());
        
    }
    
}