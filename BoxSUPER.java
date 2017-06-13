package boxsuper;
//************ NO EXPECTED RESULT***********
//SMALL CONCEPT 
//LEAVE IT
//package boxsuperconstructor;
//CALLING SUPER CLASS TRAITS

class Box
{
	 float length;
	 float breadth;
	 float height;
	
	Box()
	{
		
	}
	
	Box(float length,float breadth,float height)
	{
		this.length=length;
		this.breadth=breadth;
                System.out.println(breadth);
		this.height=height;
	}
	void Display_Dimen()
	{
		System.out.println("length : "+this.length+"\nbreadth : "+this.breadth+"\nheight : "+this.height);
	}
	
}

class Result extends Box
{
	float length=breadth=height=999;
        Result(){}
	
	Result(float length,float breadth,float height)
	{
		super(length,breadth,height);
	}
	void Area()
	{
		System.out.println("Area : "+(super.length*super.breadth));
	}
	
	void Volume()
	{
		System.out.println("Volume : "+(super.length*super.breadth*super.height));
	}
	void Der_Display()
        {
            System.out.println("Length : "+length+"\nBreadth : "+breadth+"\nHeight : "+height);
                    
        }
	
}

class BoxSUPER
{
	public static void main(String a[])
	{
		Result OBJ = new Result(40,50,60);
		OBJ.Display_Dimen();
		OBJ.Area();
		OBJ.Volume();
                OBJ.Der_Display();
	}
}