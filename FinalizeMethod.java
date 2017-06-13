/*
Refer 
https://www.youtube.com/watch?v=j3fRK7T1pQo

*/
package finalizemethod;

class Test
{
    Test()
    {
        System.out.println("Default Constructor Called");
        System.out.println("Object Created at Address : "+this);
                
    }
    
    //Finalize Method...
    
    /*
        public void finalize()  /*Does Not any arguments
        {
            //Finalize code
        }
    
    */
    public void finalize()
    {
        System.out.println("Finalized(Re-Claimed),The object at "+this+" location was Terminated");
    }
}

class FinalizeMethod
{
    public static void main(String a[])
    {
        while(true)
        {
            new Test();
                   
        }
    }
}