package bufferedreadertexteditorsimulate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTextEditorSimulate
{

    public static void main(String[] args)
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s[] = new String[100];
        int count = 0;
        for (count = 0; count < 100; count++)
        {

            try
            {
                s[count] = b.readLine();
            } catch (java.io.IOException e)
            {
                s[count] = null;

            }
            if (s[count].equals("stop"))
            {
                break;
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("ENTERED DATAA:");
        System.out.println();
        System.out.println();
        for (int i = 0; i <= count - 1; i++)
        {

            System.out.println(s[i]);

        }
        //Demostration of write()
        //java.io.IPrintStream
        System.out.write('a');
        System.out.write('\n');
    }

}
