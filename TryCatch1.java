//Display an Exception Stack

package trycatch1;
class TryCatch1
{
	public static void main(String arg[])
	{
		int num = 5,den = 0;
		try
		{   //Remember A Single Statement should never be inside Try Block
			System.out.println("Perfoming Division...");
			int ans = num/den;
		}
		catch(ArithmeticException OBJ)
		{
			System.out.println("Arithmetic Exception caught inside CATCH BLOCK");
		}
		System.out.println("This will be printed");
	}
}