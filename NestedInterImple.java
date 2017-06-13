package nestedinterimple;
//Inner Interface Implementation

class InnerInter
{
	//Nested Interface
	/*
		Interface inside a Class is called Nested Interface
	*/
	//As we r using this interface From another class we shuld declare it as Public
	//Nested Interface should be declared as PUBLIC or PRIVATE or PROTECTED
	
	public interface InnerInterface
	{
		void Show(int x);
	}

}

class B implements InnerInter.InnerInterface
{
	//Implementing Interface by its Fully Qualified Name
	/*
    REMEMBER:
    Defining a Interface?  MUST DECLARE IT AS PUBLIC
        */
        public void Show(int x)
	{
		System.out.println("This is by Nested Interface:\nThe Number is "+x);
	}
		
}

class NestedInterImple
{
	public static void main(String args[])
	{
		InnerInter.InnerInterface  Ref = new B();
		Ref.Show(5);
	}
}