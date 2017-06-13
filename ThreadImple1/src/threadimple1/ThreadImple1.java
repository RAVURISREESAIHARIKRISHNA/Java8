package threadimple1;

import static java.lang.Thread.sleep;
import java.lang.System;
import java.lang.InterruptedException;
import java.lang.IllegalThreadStateException;

public class ThreadImple1
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        System.out.println("MAIN THREAD");
        try
        {
            t.start();
        }
        catch (java.lang.IllegalThreadStateException e)
        {
            e.printStackTrace();
        }
        
        try
        {
            sleep(500);//no need t.sleep() ; because this will be called by MainThread.....And sleep() know the address of the callee thread
        }
        catch (java.lang.InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("MAIN THREAD 2");
    }
}
