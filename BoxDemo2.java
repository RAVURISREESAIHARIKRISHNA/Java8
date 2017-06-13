package boxdemo2;
//Implementing Default and Parameterized Constructors
//Implementation of "this" Pointer

class Box
{
    int Length,Width,Height;
    
    //Default Constructor
    Box()
    {
        System.out.println("\nDefault Constructor Called");
        Length=Width=Height=0;
    }
    //Parameterized Constructor
    Box(int Length,int Width,int Height)
    {
        this.Length=Length;
        this.Width=Width;
        this.Height=Height;
        System.out.println("\nParameterized Constructor Called");
    }
    //Display Contents
    void Display()
    {
        System.out.println("\nLength = "+Length+"\nWidth = "+Width+"\nHeight = "+Height);
    }
    float Volume()
    {
       return(Length*Width*Height) ;
    }
    void Display_Volume()
    {
        System.out.println("\nVOLUME : "+Volume());
    }
}

class BoxDemo2
{
    public static void main(String a[])
    {
        //Creating Objects with Deafult constructor
        Box box1=new Box();
        //Creating Objects with Parameterized Constructor
        Box box2=new Box(20,30,40);
        
        //Displaying Contents
        System.out.println("\nBOX 1 :");
        box1.Display();
        System.out.println("\nBox 2 :");
        box2.Display();
        
        //Displaying Volumes
        System.out.println("\nBOX1 VOLUME :");
        box1.Display_Volume();
        System.out.println("\nBOX2 Volume:");
        box2.Display_Volume();
    }
}