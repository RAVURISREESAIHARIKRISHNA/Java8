package threadimple;

public class ThreadImple
{
    public static void main(String arg[])
    {
        MyThread t = new MyThread();
        try
        {
            t.start();
            /*
            t.run() will just do our job but this will not create any things like registering our thread with the Thread scxheduler......
            */
        }
        catch(java.lang.IllegalThreadStateException e)
        {
            e.printStackTrace();
        }
       
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
