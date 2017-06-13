package arraylistdemoall;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAll
{

	public static void main(String[] args)
	{
		System.out.println("Creating a ArrayList with Default Constructor of Size 10");
		ArrayList<String> obj = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i <= 9; i++)
		{
			System.out.println("Enter " + (i+1) +"Element");
			obj.add(s.nextLine());

		}
		System.out.println("ENter a Position for thiss List\n"+obj);
		int pos = s.nextInt();
		StringBuffer b = new StringBuffer();
		s.nextLine();
		b.append(s.nextLine());
		obj.add(pos, b.toString());
		System.out.println("The List after adding element is : ");
		System.out.println(obj);
	}

}