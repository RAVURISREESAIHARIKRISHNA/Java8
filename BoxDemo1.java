package boxdemo1;

class Box
{
    int Length;
    int Width;
    int Height;
    
    //Methods
    
    void Display()
    {
        System.out.println("\nThe Volume is : "+Volume());
    }
    
    float Volume()
    {
        return(Length*Width*Height);
    }
    
    void SetDimen(int l,int w,int h) //With Parameters
    {
        Length=l;
        Width=w;
        Height=h;
    }
} //Doesnt Require a SemiColon 

class BoxDemo1
{
    public static void main(String a[])
    {
        //Creating Objects of Box.To be Strict Creating References to the Objects of the Class Box
        //But Java Doesnt have any Pointers Unlike C/C++
        Box box1=new Box();
        Box box2=new Box();
        
        //Assigning Some Values
        
       /* box1.Length=50;
        box1.Width=50;
        box1.Height=50;*/
       
       box1.SetDimen(50,50,50);
        
        /*box2.Length=60;
        box2.Width=70;
        box2.Height=80;*/
        
        box2.SetDimen(60,70,80);
        
        System.out.println("\nBOX 1 VOLUME:");
        box1.Display();
        
        System.out.println("Box 2 VOLUME:");
        box2.Display();
    }
}