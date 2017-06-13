package dynamicdispatch1;
class Base
{
	void show()
	{
		System.out.println("IN BASE CLASS");
	}
}

class Der extends Base
{
	void show()
	{
		System.out.println("IN DERIVED CLASS");
	}
	
	void Display()
	{
		System.out.println("IN DISPLAY MEYHOD");
	}
}

class DynamicDispatch1
{
	public static void main(String args[])
	{
		Base a;
		Der b = new Der();
		a=b;
		a.show();
		//a.Display();//Error
	}
}