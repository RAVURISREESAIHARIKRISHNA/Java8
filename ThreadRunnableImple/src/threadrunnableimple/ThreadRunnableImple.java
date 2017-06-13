package threadrunnableimple;

public class ThreadRunnableImple
{
    public static void main(String[] args)
    {
        ThreadRunnable r = new ThreadRunnable();
        Thread t = new Thread(r);
        System.out.println("Current Execution Thread is "+Thread.currentThread().getName());
        System.out.println("Now Invoking Child Thread");
        try
        {
            t.start();
        } catch (java.lang.IllegalThreadStateException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        try
        {
            t.start();
        }
        catch (java.lang.IllegalThreadStateException e)
        {
            e.printStackTrace();
        }
       
    }
}