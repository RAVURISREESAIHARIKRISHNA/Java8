package noofsubstringsdemo;

import static java.lang.System.exit;
import java.util.Scanner;

public class NoOFSubstringsDemo
{
    public static void main(String args[])
    {
        System.out.println("Enter Main String");
        Scanner s = new Scanner(System.in);
        String mainString;
        String subString;
        mainString = s.nextLine();
        System.out.println("Enter SubString");
        subString = s.nextLine();
        NoOFSubStrings obj = new NoOFSubStrings(mainString);
        int count = obj.Occurances(subString);
        if(count==-1)
        {
            System.out.println("There are no Occurances");
            exit(0);
        }
        System.out.println("There are "+count+" Occurances");
    }
}
