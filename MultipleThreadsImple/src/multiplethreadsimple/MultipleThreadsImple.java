package multiplethreadsimple;

public class MultipleThreadsImple
{
    public static void main(String[] args)
    {
        System.out.println("START");
        try {
            MultipleThreads obj1 = new MultipleThreads("ONE");
            obj1.t.join();//waits for Thread of Obj1 to complete
            //as this was written in main thread ; main thread waits untill thread corresponding to onj1 completes its excution
            MultipleThreads obj2 = new MultipleThreads("TWO");
            obj2.t.join();
            MultipleThreads obj3 = new MultipleThreads("THREE");
            obj3.t.join();
            MultipleThreads obj4 = new MultipleThreads("FOUR");
            obj4.t.join();
            MultipleThreads obj5 = new MultipleThreads("FIVE");
            obj5.t.join();
        } catch (java.lang.InterruptedException e)
        {
            System.out.println(Thread.currentThread().getName()+" was Interrupted");
            System.out.println("HERE");
        }
//        try
//        {
//            obj1.t.join();
////            obj2.t.join();
////            obj3.t.join();
////            obj4.t.join();
////            obj5.t.join();
//        }
//        catch (java.lang.InterruptedException e)
//        {
//            System.out.println("JOIN EXCEPTION");
//        }
    }
}
