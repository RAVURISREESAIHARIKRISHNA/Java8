package bufferedreadderstringdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReadderStringDemo
{

    public static void main(String[] args)
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true)
        {
            try
            {
                str = b.readLine();
            } catch (java.io.IOException e)
            {
                System.out.println("here");
                str = null;
                e.printStackTrace();
            }
            System.out.println(str);
            if (str.equals("stop"))
            {//Using equals because == will compare Object References..
                System.exit(0);

            }
        }
    }
}
