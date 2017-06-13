package threadnameimple;

import static java.lang.Thread.sleep;

public class ThreadNameImple
{
    public static void main(String[] args)
    {        
        System.out.println("Parent Thread: My name is  "+Thread.currentThread().getName());
        ThreadName r = new ThreadName();
        Thread t = new Thread(r);
        try 
        {
            t.start();
        } 
        catch (java.lang.IllegalThreadStateException e) 
        {
            e.printStackTrace();
        }
        //System.out.println("Parent Thread: My name is  "+Thread.currentThread().getName());
        try 
        {
            sleep(500);
        } 
        catch (java.lang.InterruptedException e)
        {
            System.out.println("NOT INTERRUPTED");
        }
//        try 
//        {
//            t.stop();
//        } 
//        catch (java.lang.SecurityException e)
//        {
//            System.out.println("here");
//        }
        
//        t.setName("PO");
        Thread.currentThread().setName("Kung Fu Panda");
        System.out.println("Parent Thread: My name is  "+Thread.currentThread().getName());
        /*
        THREAD ONCE TERMINATED CANNOT BE BROUGHT AGAIN
        
        SO CREATING ANOTHER THREAD INSTANCE........
        */
        
        Thread t1 = new Thread(r,"PO");
        try {
            t1.start();
        } catch (java.lang.IllegalThreadStateException e)
        {
            e.printStackTrace();
        }
//        try
//        {
//            t.start();
//        }
//        catch (java.lang.IllegalThreadStateException e)
//        {
//            //e.printStackTrace();
//            System.out.println("here");
//        }
//        
    }
}
