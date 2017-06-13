package bufferedwriterdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterDemo
{

    public static void main(String[] args)
    {
        System.out.println("Creating a BufferedWriter Class");
        System.out.println("Enter File Name");
        String FileName;
        Scanner s = new Scanner(System.in);
        FileName = s.nextLine();
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FileName));
            bw.write("Hello\nWorld!");
            bw.flush();
            bw.close();

        } catch (java.io.IOException e)
        {
        }
    }
}
