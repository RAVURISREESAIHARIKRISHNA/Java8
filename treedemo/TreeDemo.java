package treedemo;

import java.util.Scanner;

public class TreeDemo
{

	public static void main(String [] args)
	{
		Scanner s = new Scanner ( System.in );
		int value , op;
		Tree tree = new Tree ();
		System.out.println ( "TREE DEMO" );
		while (true)
		{
			System.out.println ( "\tMENU" );
			System.out.println ( "1.INSERT" );
			System.out.println ( "2.Search" );
			System.out.println ( "3.Inorder Traversal" );
			System.out.println ( "4.Pre-Order Traversal" );
			System.out.println ( "5.Post-Order Traversal" );
			System.out.println ( "Enter OPtion" );
			try
			{
				op = s.nextInt ();
			} catch (java.util.InputMismatchException e)
			{
				System.out.println ( "Illegal Entry" );
				continue;
			}
			switch (op)
			{
				case 1:
					System.out.println ( "ENter a value" );
					try
					{
						value = s.nextInt ();
					} catch (java.util.InputMismatchException e)
					{
						System.out.println ( "Illegal Entry" );
						continue;
					}
					tree.insert ( value );
					break;
				case 2:
					System.out.println ( "Enter a Value to search" );
					try
					{
						value = s.nextInt ();
					} catch (java.util.InputMismatchException e)
					{
						System.out.println ( "Illegal Entry" );
						continue;
					}
					boolean status = tree.search ( value );
					if (status)
					{
						System.out.println ( "Found" );
					}
					else
					{
						System.out.println ( "NOt Found" );
					}
					break;
				case 3:
					tree.inorderDisplay ();
					break;
				case 4:
					tree.preorderDisplay ();
					break;
				case 5:
					tree.postorderDisplay ();
					break;
				default:
					System.out.println ( "WRONG OPTION ENTRY " );

			}

		}

	}

}
