package abstractclass;
/*
Any class Containg atleast one Abstract Function is also an Abstract Class.

And that Class must ALSO BE DECLARED AS ABSTRACT....
*/

abstract class Figure
{
	float a;
	float b;
	
	Figure(float a,float b)
	{
		this.a = a;
		this.b = b;
	}
	
	abstract void area();
}

class Rectangle extends Figure
{
	Rectangle(float a,float b)
	{
		super(a,b);
	}
	
	void area()
	{
		System.out.println("\nArea = "+(this.a*this.b));
	}
}

class Triangle extends Figure
{
	Triangle(float a,float b)
	{
		super(a,b);
	}
	
	void area()
	{
		System.out.println("Area = "+(this.a+this.b));//Funny Formula
	}
}

class AbstractClass
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(1,2);
		r.area();
		
		Triangle t = new Triangle(1,2);
		t.area();
	}
}