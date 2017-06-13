package filereaderdemo;

import java.io.FileReader;
import java.util.Scanner;

public class FileReaderDemo
{
    public static void main(String[] args)
    {
        System.out.println("Creating a FileReader Class....");
        FileReader fr;
        System.out.println("Enter the File Address");
        String FileAddress;
        Scanner s = new Scanner(System.in);
        FileAddress = s.nextLine();
        try
        {
            fr = new FileReader(FileAddress);
            int ch;
            while(true){
                ch = fr.read();
                if(ch==-1)break;
                System.out.print((char)ch);
            }
        } catch (java.io.IOException e)
        {
        }
    }
}
