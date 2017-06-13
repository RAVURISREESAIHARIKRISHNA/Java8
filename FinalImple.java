package finalimple;

class Test
{
    int a;
    final int h;
    //Either h should be initialized here OR in Constructor Body...
    Test(){h=5;}
    
    Test(int a)
    {
        this.a = a;
        h=0;
    }
    
    void Display()
    {
        System.out.println("a : "+a+"\n"+"h : "+h);
    }
}

class FinalImple 
{
   public static void main(String a[])
   {
    Test obj= new Test(5);
   
    obj.Display();
   }
}
