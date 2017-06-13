package readinteger;

import java.util.Scanner;

class ReadInteger
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter a Number");
        x = s.nextInt();
        System.out.println("You have Entered "+x);
    }
}