package downcast;

class Base
{
	int a;
	
	Base(){}
	
	Base(int a)
	{
		this.a=a;
	}
	
	void Display()
	{
		System.out.println("a : "+this.a);
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
	
	void Der_Display()       //When Given same name 'Display()' i.e. when overloaded b.Display() is showing both the values of a and b....
	{
		System.out.println("a : "+a+"\nb : "+b);
	}
	/*Should WORK THIS OUT LATER */
	void Sum()
	{
		System.out.println("Sum is : "+(this.a+this.b));
	}
}

class DownCast
{
	public static void main(String a[])
	{
		Base b = new Base();
		Der d = new Der(1,2);
		
		d.Der_Display();
		d.Sum();
		
		//Downcasting...
		b=d;
		
		b.Display();
		//b.Sum(); //This Wont work
	}
	
}