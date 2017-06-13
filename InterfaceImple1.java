package interfaceimple1;
//Interface Basic Implementation

/*
		INTERFACE DECLARATION SYNTAX:
		
		interface name
		{
			<data type> <Method name>(arg-list);
		}
*/

interface I1
{
	void Show(int i );//Only Function Signature Required,No need of Identifiers like Show(int i)
        //Program should Execute though a Warning arises
        //Keeping identifier to Satisfy Netbeans
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

class InterfaceImple1
{
	public static void main(String arg[])
	{
		//Creating a Interface Reference Variable
		
		I1 InterRef = new Client();
		
		InterRef.Show(5);
		//InterRef.Display(5);  This Does'nt Work
		
		//Creating an Object Refernce Variable
		Client ObjRef = new Client();
		ObjRef.Display(5);
	}
}