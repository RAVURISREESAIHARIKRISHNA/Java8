//C++ STYLE OF STATIC MEMBER FUNCTIONS......

package staticfuncimple;

class Test
{
   int a;
   static int count;
   
   Test(){}
   Test(int a)
   {
       this.a=a;
       
   }
   void Display()
   {
       count++;
       System.out.println("a : "+this.a+"\nCount : "+count+"\n");
   }
   static void Reset()
   {
       count=0;
       System.out.println("Count : "+count+"\n");
   }
}
public class StaticFuncImple 
{
    public static void main(String a[])
    {
        Test A = new Test(9);
        Test B = new Test(9);
        A.Display();
        Test.Reset();
        B.Display();
        Test.Reset();
    }
    
}
