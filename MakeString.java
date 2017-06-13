package makestring;
class MakeString
{
	public static void main(String arg[])
	{
		//Method 1
		//Direct Assignment
		String S1 = "Direct Assignment";
		
		//Method 2
		//Creating an Empty String
		String S2 = new String();
		
		//Method 3
		//Creating a String by assigning The reference of a Charater array
		char arr[] = {'a','b','c','d','e'};
		String S3 = new String(arr);
		
		//Method 4
		//Same but by Giving Boundaries
		//Syntax:
		//String(CharArrayRef , StartIndex , NumberOfChars)
		String S4 = new String(arr,1,3);
                
                //Method 5
                //Direct copy of one obj to another
                String S5 = new String(S4);
		
		System.out.println("Method 1");
		System.out.println(S1);
		System.out.println("Method 2");
		System.out.println(S2);
		System.out.println("Method 3");
		System.out.println(S3);
                System.out.println("Method 4");
                System.out.println(S4);
                System.out.println("Method 5");
                System.out.println(S5);
		System.out.println("Special Method of Finding Length");
		System.out.println("abc".length());
                //String,valueOf() Returns the Human Readble String Equivalent of The Single argument passed on its Paranthesis
                System.out.println(String.valueOf(6));;
	}
}