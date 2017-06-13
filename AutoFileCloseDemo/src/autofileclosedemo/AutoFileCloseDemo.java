package autofileclosedemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AutoFileCloseDemo
{

    public static void main(String[] args)
    {
        PrintWriter p = new PrintWriter(System.out, true);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        p.println("Enter File Address");
        String add = null;
        try
        {
            add = b.readLine();
        } catch (java.io.IOException e)
        {
        }
        //ARM
        //FileInputStream fin = null;
        int i;
        try (FileInputStream fin = new FileInputStream(add))
        {
            while (true)
            {
                i = fin.read();
                if (i != -1)
                {
                    p.print((char) i);
                    p.flush();
                } else
                {
                    p.println();
                    break;
                }
            }
        } catch (java.io.IOException e)
        {
            System.out.println("HERE");
        }
    }

}
