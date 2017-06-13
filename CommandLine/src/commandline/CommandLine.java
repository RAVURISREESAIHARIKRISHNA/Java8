package commandline;
//SHOULD RUN .........
//BUT DON't Know Why it is not Running.....
import static java.lang.Integer.parseInt;
import java.lang.System;
import static java.lang.System.exit;

public class CommandLine
{
    public static void main(String arg[])
    {
        int a,b;
        try
        {
            a = parseInt(arg[0]);
            b = parseInt(arg[2]);
        }
        catch(NumberFormatException OBJ)
        {
            System.out.println("ILLEGAL INTEGER ENTRY");
            exit(0);
            a=b=0;//If Exception Occurs and though we are exiting it is asking for the variables below to be initialised to some value
        }
        
        char op = arg[1].charAt(0);//charAt(pos) returns the character at the position at pos{Indexed from 0 to n-1} in the associated String Object
        switch(op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.printf("%f",a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Wrong Option\nTRY AGAIN");
                exit(0);
        }
    }
}
/*
*********************** HERE IS THE MODIFICATION WHICH WILL RUN ON COMMANDLINE

1. REMOVED PACKAGE

AND ITS WORKING WHEN RUNED..............
*/