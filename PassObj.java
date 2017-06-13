package passobj;

class Test
{
    int a;
    
    Test(int a)
    {
        this.a=a;
    }
    
    int IsEqual(Test o)
    {
        if(o.a==this.a)
            return 1;
        else
            return 0;
    }
}
public class PassObj 
{
    public static void main(String a[])
    {
        Test obj1 = new Test(1);
        Test obj2 = new Test(2);
        Test obj3 = new Test(1);
        if(obj1.IsEqual(obj2)==1)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        if(obj1.IsEqual(obj3)==1)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
    
}
