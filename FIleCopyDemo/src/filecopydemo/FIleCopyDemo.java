package filecopydemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FIleCopyDemo {

    public static void main(String[] args) {
        PrintWriter p = new PrintWriter(System.out, true);
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String source = null, destination = null;
        int status = 0;
        p.println("Enter completely Qualified Source Address(ASCII)");
        try {
            source = b.readLine();
        } catch (java.io.IOException e) {
            p.println("Error");
        }
        p.println("Enter completely Qualified Destination Address(ASCII)");
        try
        {
            destination = b.readLine();
        } catch (java.io.IOException e)
        {
            p.println("Error");
        }
        FileCopy obj = new FileCopy();
        status = obj.fileCopy(source, destination);
        if (status == 1) {
            p.println("FileCopy Successfull!");
        } else {
            p.println("File Copy Failed!");
        }

    }

}
