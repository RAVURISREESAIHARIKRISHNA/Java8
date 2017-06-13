package stringwordprinter;

import java.util.Scanner;

public class StringWordPrinterDemo
{
    public static void main(String args[])
    {
        System.out.println("Enter a String");
        String string;
        Scanner s = new Scanner(System.in);
        string = s.nextLine();
        StringWordPrinter obj = new StringWordPrinter(string);
        obj.Printer();
        
    }
}