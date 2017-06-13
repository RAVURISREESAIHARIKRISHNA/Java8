package arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListImple
{
	public static void main(String arg[])
	{
		System.out.println("Creating an Object of type ArrayList...");

		// ArrayList<Integer> l=new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		// System.out.println("Enter a Number");
		// int a;
		// a = s.nextInt();
		// System.out.println("Storing" + a + " in the Array List \'l\'");
		// l.add(a);
		// System.out.println(l);
		System.out.println("Enter Initial Size:");
		int size;
		int a;
		size = s.nextInt();
		ArrayList<Integer> l = new ArrayList<Integer>(size);
		for (int i = 0; i <= size - 1; i++)
		{
			System.out.println("Enter " + (i + 1) + " element : ");
			a = s.nextInt();
			l.add(a);
		}
		System.out.println("The List is ");
		l.add(null);
		System.out.println(l);
		System.out.println("Size is : " + l.size());
	}
}