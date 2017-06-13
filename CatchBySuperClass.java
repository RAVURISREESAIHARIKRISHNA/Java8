package catchbysuperclass;
class CatchBySuperClass
{
	public static void main(String arg[])
	{
		int num = 8,den = 0;
		try
		{
			System.out.println("In Try Block\nPerforming Division...");
			int ans = num/den;
		}
		catch(Exception OBJ)
		{
			System.out.println("Exception caught inside Exception CATCH BLOCK");
		}
		/*catch(ArithmeticException OBJ)
		{
			System.out.println("This Would never Print");
		}*/
	}
}