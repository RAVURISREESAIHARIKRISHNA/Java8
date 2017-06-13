package dynamicdispatch;
class A
{
	A()
	{
		System.out.println("\nA COnstructor Called");
	}
	
	void display()
	{
		System.out.println("\nA's Display Function");
	}
}

class B extends A
{
	B()
	{
		System.out.println("\nB Constructor Called");
	}
	
	void display()
	{
		System.out.println("\nB's Display Function");
	}
}

class C extends A
{
	C()
	{
		System.out.println("\nC Constructor called");
	}
	
	void display()
	{
		System.out.println("\nC's Display Function");
	}
}

class DynamicDispatch
{
	public static void main(String af[])
	{
			A a = new A();
			B b = new B();
			C c = new C();
			
			A p; //Creating a Reference to an Object,But not pointing to any Object
			
			p = a; //Making p to point to Object a
			p.display();//Dynamic Dispatch
			
			p = b; //Downcasting...
			p.display();//Dynamic Dispatch
			
			p = c; //Downcasting...
			p.display();//Dynamic Dispatch
                        
                        /*
                        Like in C++ No need to declare functions as Virtual...
                        */
	}
}