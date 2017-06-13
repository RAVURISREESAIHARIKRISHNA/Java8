//CONSTRUCTOR UNDER INHERIATNCE  1

class Base
{
	int a;
	
	Base()
	{
		System.out.println("\nBASE CLASS DEFAULT CONSTRUCTOR CALLED\n");
	}
	
	Base(int a)
	{
		this.a = a;
		System.out.println("\nBASE CLASS PARAMETERIZED CONSTRUCTOR CALLED\n");
	}
}

class Der extends Base
{
	int b;
	
	Der()
	{
		System.out.println("\nDERIVED CLASS DEFAULT CONSTRUCTOR CALLED\n");
	}
	
	Der(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("\nDERIVED CLASS PARAMETERIZED CONSTRUCTOR CALLED\n");
	}
}

class ConstructorInheritance1
{
	public static void main(String a[])
	{
		Der OBJ = new Der(1,2);
	}
}