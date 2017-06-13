package displaystringvertical;

import java.util.Scanner;

public class DisplayStringVertical
{
    public static void main(String args[])
    {
        System.out.println("Enter a String");
        String string;
        Scanner s = new Scanner(System.in);
        string = s.nextLine();
        StringVerticalDemo obj = new StringVerticalDemo(string);
        obj.Vertical();
    }
}