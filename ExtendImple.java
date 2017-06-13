package extendimple;

class Base
{
    int a;
    
    Base(){}
    Base(int a)
    {
        this.a=a;
    }
    
    void Base_Display()
    {
        System.out.println("Base a : "+this.a);
    }
    
    void Show()
    {
        System.out.println("Base a : "+this.a);
    }
}

class Der extends Base
{
    int b;
    Der(){}
    Der(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void Der_Display()
    {
        //System.out.println("Base a : "+this.a);
        Base_Display();
        System.out.println("Der b : "+this.b);
    }
    
    void Show()
    {
        System.out.println("\nThis is Der Func...\nOverloaded..\n");
        System.out.println("Der b : "+this.b);
    }
    
    void Sum()
    {
        System.out.println("Sum  : "+(this.a+this.b));
    }
}
class ExtendImple
{
   public static void main(String a[])
   {
       Der obj = new Der(1,2);
       obj.Der_Display();
       obj.Show();
       obj.Sum();
   }
   
}
