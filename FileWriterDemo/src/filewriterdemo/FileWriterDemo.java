package filewriterdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo
{

    public static void main(String[] args)
    {
        System.out.println("Creating FileWriter Object...");

        FileWriter fw;
        System.out.println("Enter a File Name");
        String FileName;
        Scanner s = new Scanner(System.in);
        FileName = s.nextLine();
        try
        {
            fw = new FileWriter(FileName);
            System.out.println("Plsease Enter Data.....\nUse\\n for New Line in the file and To stop entering Press Enter");
            //s.nextLine();
            String Data = s.nextLine();
            //String Data = "Hello\nWorld";
            System.out.println("data is .......");
            System.out.println(Data);
            fw.write(Data);
            
            fw.close();
        } catch (IOException e)
        {
            System.out.println("Go to HOME!!!!");
        }
    }

}