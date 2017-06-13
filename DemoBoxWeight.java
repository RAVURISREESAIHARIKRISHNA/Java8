package demoboxweight;

class Box
{
    float length,width,height;
    
   /* Box()
    {
        length=width=height=0;
    }
    
   Box(float length,float width,float height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    ///Ee part pettina No error Raavaali!!!!!!!!!!
    
    Box(Box obj)
    {
        this.length=obj.length;
        this.height=obj.height;
        this.width=obj.width;
    }*/
}

class BoxProp extends Box
{
    BoxProp(){}
    BoxProp(float a,float b,float c)
    {
        this.length=a;
        this.width=b;
        this.height=c;
    }
    double Volume()
    {
        return(length*height*width);
    }
    double Area()
    {
        return(length*width);
    }
    void Display()
    {
        System.out.println("Length : "+this.length+"\nWidht : "+this.width+"\nHeight : "+this.height+"\nArea : "+Area()+"\nVolume : "+Volume());
        
    }
}
class DemoBoxWeight
{

   
    public static void main(String[] args)
    {
        BoxProp OBJ = new BoxProp(1,2,3);
        OBJ.Display();
    }
   
    
}
