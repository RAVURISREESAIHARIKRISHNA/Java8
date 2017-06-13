package boxsuperconstructor;
//CALLING SUPER CLASS CONSTRUCTOR

class Box
{
	private float length;
	private float breadth;
	private float height;
	
	Box()
	{
		
	}
	
	Box(float length,float breadth,float height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	void Display_Dimen()
	{
		System.out.println("length : "+length+"\nbreadth : "+breadth+"\nheight : "+height);
	}
	
	void Area()
	{
		System.out.println("Area : "+(this.length*this.breadth));
	}
	
	void Volume()
	{
		System.out.println("Volume : "+(this.length*this.breadth*this.height));
	}
	
}

class Result extends Box
{
	Result(){}
	
	Result(float length,float breadth,float height)
	{
		super(length,breadth,height);
	}
	
	
}

class BoxSUPERconstructor
{
	public static void main(String a[])
	{
		Result OBJ = new Result(40,50,60);
		OBJ.Display_Dimen();
		OBJ.Area();
		OBJ.Volume();
	}
}