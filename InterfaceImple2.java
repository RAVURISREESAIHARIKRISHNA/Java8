package interfaceimple2;
interface I1
{
	void Show(int i);
}

class Client implements I1
{
	//Defining Interface Method
	/*
		DEFINING INTERFACE METHOD:
		
		INTERFACE METHOD MUST BE DEFINED INSIDE A CLASS WITH public ACESS MODIFIER
	*/
	public void Show(int i)
	{
		System.out.println("\nInterface Method:\nThe Number is "+i);
	}
	
	void Display(int i)
	{
		System.out.println("\nClass Method:\nThe Number is "+i);
	}
	
	Client()
	{
		System.out.println("\nClient Default Constructor called");
	}
}
class AnotherClient implements I1
{
	//Defining Interafce Method
	void DisplayAnother(int i)
	{
		System.out.println("\nClass Method:\nThe Number is "+i);
	}
	
	public void Show(int i)
	{
		System.out.println("\nInterface Method:\nThe number Square is : "+(i*i));
	}
	
	AnotherClient()
	{
		System.out.println("\nClient Default Constructor called");
	}
}

class InterfaceImple2
{
	public static void main(String arg[])
	{
		//Creating Interface Reference Variable
		I1 InterRef = new Client();
		InterRef.Show(5);
		
		//Creating Class Object Ref Variable
		AnotherClient ObjRef = new AnotherClient();
		ObjRef.DisplayAnother(5);
		
		//Interface Reference Variable Pointing to ObjRef
		InterRef = ObjRef;
		InterRef.Show(5);
	}
}