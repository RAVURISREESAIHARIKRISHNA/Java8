package filereaddemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileReadDemo
{

    public static void main(String[] args)
    {
        PrintWriter p = new PrintWriter(System.out, true);
        p.println("Enter a completely Qualified File (ASCII) File Name");
        String addr;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            addr = b.readLine();
        } catch (java.io.IOException e)
        {
            addr = null;
        }
        FileInputStream fin = null;
        int i;
        try
        {
            fin = new FileInputStream(addr);
            while (true)
            {
                i = fin.read();//Returns Integer Equivalent of the BYTE read;returns -1 if not read
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
            p.println("Exception Found");
        } finally
        {
            try
            {
                if (fin != null)
                {
                    fin.close();
                }
            } catch (java.io.IOException e)
            {
                p.println("File not closed");
            }
        }
    }
}
