package acessspeci_trail_1;

class Test
{
    private int l,b,w;
    
    Test()
    {
        System.out.println("Default Constructor Called");
    }
    
    Test(int l,int b,int w)
    {
        this.l=l;
        this.b=b;
        this.w=w;
    }
    double Volume()
    {
        return(l*b*w);
    }
    
    double Area()
    {
        return(l*b);
    }
    
    void Display_Dimensions()
    {
        System.out.println("The Dimensions of the Box are:"+l+"\n"+b+"\n"+w);
    }
    void Display_Result()
    {
        System.out.println("Area = "+Area()+"\nVolume = "+Volume());
    }
}

class AcessSpeci_trail_1
{
    public static void main(String a[])
    {
        Test obj = new Test(1,2,3);
        obj.Display_Dimensions();
        obj.Display_Result();
        
        Test obj1 = new Test();
    }
}