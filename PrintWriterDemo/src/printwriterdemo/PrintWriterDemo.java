package printwriterdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo
{

    public static void main(String[] args)
    {

        System.out.println("Initilizing PrintWriter");
        /*
        PrintWriter(OutputStream out, boolean autoFlush)
            Creates a new PrintWriter from an existing OutputStream.
         */
        PrintWriter p = new PrintWriter(System.out, true);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str;
        p.println("Hello Dude!");
        p.print("Hi Dude\n");
        p.flush();//Not required for println() if auto flush is enabled
        System.out.println("Enter a String");
        try
        {
            str = b.readLine();
        } catch (java.io.IOException e)
        {
            str = null;
        }

        p.print("Entered Data is :\n");
        p.flush();
        p.println(str);
    }

}
