package outputformattingimple;
/*
*****************   HACKER-RANK *********************
*/
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class OutputFormattingImple
{
    public static void main(String[] args)
    {
        String a,b,c;
        Scanner s = new Scanner(System.in);
        try {
           // s.nextLine();
            a = s.nextLine();
            //s.nextLine();
            b = s.nextLine();
            //s.nextLine();
            c = s.nextLine();
            //s.nextLine();
        }
        catch (java.util.InputMismatchException e)
        {
            a = b = c = null;
        }
        int a1,b1,c1;
        a1 = a.indexOf(" ");
        b1 = b.indexOf(" ");
        c1 = c.indexOf(" ");
        
        String d = a.substring(0, a1-1);
        String e = b.substring(0, b1-1);
        String f = c.substring(0, c1-1);
        
        int x = parseInt(a.substring(a1+1,a.length()));
        int y = parseInt(b.substring(b1+1,b.length()));
        int z = parseInt(c.substring(c1+1,c.length()));
        if((x<=999&&x>=0)&&(y>=0&&y<=999)&&(z>=0&&z<=999))
        {
            System.out.printf("%-15s %03d\n",d,x);
            System.out.printf("%-15s %03d\n",e,y);
            System.out.printf("%-15s %03d",f,z);
        }
    }
}
