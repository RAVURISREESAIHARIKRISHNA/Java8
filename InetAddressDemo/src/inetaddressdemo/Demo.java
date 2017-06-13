package inetaddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo
{
	public static void main(String arg[])
	{
		System.out.println ( "Creating a InetAddress on LocalHost...." );
		InetAddress  obj;
		try
		{
			obj= InetAddress.getLocalHost ();
			System.out.println ( obj );
		} catch (UnknownHostException e)
		{
			System.out.println ( "UnknownHostException LocalHost" );
		}
		System.out.println ( "Creating InetAddress on getByName..." );
		try
		{
			obj = InetAddress.getByName ( "www.vizagsteel.com" );
			System.out.println ( obj );
		}catch (UnknownHostException e)
		{
			System.out.println ( "UnknownHostException LocalHost" );
		}
		System.out.println ( "GetAllByName" );
		try
		{
			InetAddress OBJ[]  = InetAddress.getAllByName ( "www.google.com" );
			for (int i = 0; i < OBJ.length; i ++ )
			{
				System.out.println ( OBJ[i] );
			}
		}catch (UnknownHostException e)
		{
			System.out.println ( "UnknownHostException LocalHost" );
		}
	}
}
