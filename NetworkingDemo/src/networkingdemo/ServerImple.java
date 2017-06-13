package networkingdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImple
{
	static final int port = 8080;
	public static void main(String arg[])
	{
		try
		{
			ServerSocket s = new ServerSocket(port);
			System.out.println("Server Started :"+s);
			Socket socket = s.accept ();
			System.out.println("Connection accepted, socket:"+ socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream ()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream ())),true);
			while(true)
			{
				String str = in.readLine ();
				if(str.equals ( "END" ))
					break;
				System.out.println("Echoing :"+ str);
				out.println(str);
			}
			System.out.println ( "Closing..." );
			socket.close ();
		}
		catch(Exception e)
		{
			System.out.println ( "HERE" );
		}
	}
}
