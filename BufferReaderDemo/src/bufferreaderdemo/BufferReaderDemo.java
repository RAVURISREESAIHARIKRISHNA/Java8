package bufferreaderdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo
{

    public static void main(String[] args)
    {
        System.out.println("Creating a BufferReader");
        /*
        BuffereReader obj = new BufferReader(Reader obj);
        Reader
          ^
          |
        InputStreamReader
        
        InputStreamReader( InputStream obj )//Constructor
        System.in is an InputStream Object
        System -> Class
        in ->Final Static InputStream in the Class System
         */
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        char ch;
        while (true)
        {
            //read Characters
            /*
            read()
            The character read, as an integer in the range 0 to 65535 (0x00-0xffff), or -1 if the end of the stream has been reached
             */
            try
            {
                ch = (char) b.read();
            } catch (java.io.IOException e)
            {
                ch = 'q';
                e.printStackTrace();
            }
            System.out.print(ch);
            if (ch == 'q')
            {
                System.exit(0);

            }
        }
    }
}
