package threadimple1;

public class MyThread extends Thread
{
    
    @Override
    public void run()
    {
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("5 x "+i+" = "+5*i);
        }
    }
    public void run(int i)
    {
        System.out.println("If you are seeing this ,\nYOU ARE MESSED UP!!!");
    }
    @Override
    public void start()
    {
        System.out.println("Calling \"run()\" MEthod");
        super.start();
               
    }
}