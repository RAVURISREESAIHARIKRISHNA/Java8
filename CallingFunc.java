package callingfunc;

class Test
{
    int a;
    int b;
    Test()
    {
        System.out.println("Default Constructor Called");
        a=0;
        b=0;
    }
    
    Test(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Parameterized Constructor Called");
    }
    
    //Call By Value
    void Swap(int a,int b)
    {
        //this Pointer is used to Make Swap Function Occur,Though it is Call By Value
        int temp;
        temp=this.a;
        this.a=this.b;
        this.b=temp;
    }
    //Assign given Data
    void SetData(int a,int b)
    {
        this.a=a;this.b=b;
    }
    //Call By Reference
    //*********Passing Object is Call By Referenece**********
    //Beacuse ObjectName is a pointer to The Object
    void SwapRef(Test obj)
    {
        int temp;
        temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    //Display Data
    void Display()
    {
        System.out.println("\nDETAILS:\na : "+this.a+"\nb : "+this.b);
    }
}

class CallingFunc
{
    public static void main(String a[])
    {
        Test obj1;
        obj1=new Test();
        obj1.SetData(3,4);
        obj1.Swap(3,4);
        obj1.Display();
        obj1.SwapRef(obj1);
        obj1.Display();
    }
}