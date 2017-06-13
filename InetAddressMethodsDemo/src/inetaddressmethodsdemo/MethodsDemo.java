package inetaddressmethodsdemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MethodsDemo
{
	public static void main(String args[])
	{
		InetAddress obj;
		System.out.println ( "Checking Whether Internet is available or not...." );
		try
		{//System.out.println ( "r2" );
			obj = InetAddress.getByName ( "www.google.com" );//System.out.println ( "R1" );
			try
			{//System.out.println ( "r3" );System.out.println ( obj.isReachable ( 50 ) );
				if (obj.isReachable ( 5000 ))
					System.out.println ( "Internet Available" );
				else
					System.out.println ( "Internet not available" );
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace ();
			}
		} catch (UnknownHostException e)
		{
			System.out.println ( "Internet Not Available" );
		}
		System.out.println ( "Enter a Website to get its IP address" );
		String name;
		Scanner s = new Scanner ( System.in );
		name = s.nextLine ();
		try
		{
			obj = InetAddress.getByName ( name );
			System.out.println ( "The IP Address is" );
			System.out.println ( obj.getHostAddress () );
		} catch (UnknownHostException e)
		{
			System.out.println ( "HERE" );
		}

	}
}
