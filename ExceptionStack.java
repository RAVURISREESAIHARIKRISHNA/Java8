//Display an Exception Stack

class ExceptionStack
{
	public static void main(String arg[])
	{
		int num = 5,den = 0;
		System.out.println("Perfoming Division...");
		int ans = num/den;
		System.out.println("This will not be printed");
	}
}