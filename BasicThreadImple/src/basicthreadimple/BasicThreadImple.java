package basicthreadimple;
import java.lang.System;
public class BasicThreadImple
{
    public static void main(String arg[])
    {
        Thread t = Thread.currentThread();
        System.out.println(t);
        try
        {
            t.sleep(500);
        }
        catch(java.lang.InterruptedException obj)
        {
            System.out.println("INTERRUPTED");
        }
        t.setName("Boobmba");
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println("Priority is:"+t.getPriority());
        System.out.println("Is Alive ?:"+t.isAlive());
        
        
    }
    
}
