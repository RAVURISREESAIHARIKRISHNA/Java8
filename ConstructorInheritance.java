package constructorinheritance;
//CONSTRUCTOR UNDER INHERITANCE 

class Base
{
	Base()
	{
		System.out.println("\nBASE CLASS CONSTRUCTOR CALLED\n");
	}
}

class Der extends Base
{
	Der()
	{
		System.out.println("\nDERIVED CLASS CONSTRUCTOR CALLED\n");
	}
}

class ConstructorInheritance
{
	public static void main(String a[])
	{
		Der OBJ = new Der();
	}
}

/*
RESULT :
    Same as in C++

Base Class Constructor will be Called inside the Derived Class Constructor 

*/