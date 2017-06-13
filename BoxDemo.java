package boxdemo;
// Creating a New Class Box

class Box
{
    int Length;
    int Width;
    int Height;
} //Note: There is No need of Semi-Colon unlike in C++

//Creating a Main Class
// Its name Should Coincide with .java file as it contains the Main Function

class BoxDemo
{
    public static void main(String a[])
    {
        //Creating an Object of Class Box
        
        /*
        Syntax :
        
            ClassName ObjectName=new ClassName();
        
        */
        
        Box box1=new Box();
        Box box2=new Box();
        
        box1.Length=50;
        box1.Width=50;
        box1.Height=50;
        
        box2.Length=60;
        box2.Width=70;
        box2.Height=80;
        
        float Volume1,Volume2;
        
        Volume1=box1.Height*box1.Length*box1.Width;
        System.out.println("The Volume of first box is : "+Volume1);
        Volume2=box2.Height*box2.Length*box2.Width;
        System.out.println("The Volume of Second box is : "+Volume2);
        
        //When We do box2=box1;
        //box2 will be referenced to the Memory location of box1
        //NOTE : The Objects Are not Variables
        //They Point to the Variables(objects) of their Respective class
        //SO...
        System.out.println("\nAfter box2=box1; \n");
        box2=box1;
        Volume1=box1.Height*box1.Length*box1.Width;
        System.out.println("The Volume of first box is : "+Volume1);
        Volume2=box2.Height*box2.Length*box2.Width;
        System.out.println("The Volume of Second box is : "+Volume2);
              
    }
}
