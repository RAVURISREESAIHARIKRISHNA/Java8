package filecopyfilereaderwriter;

import java.util.Scanner;

public class FileCopyFileReaderWriter
{

    public static void main(String[] args)
    {
        System.out.println("Enter Source File");
        String source, target;
        Scanner s = new Scanner(System.in);
        source = s.nextLine();
        System.out.println("Enter Target File");
        target = s.nextLine();
        FileCopy obj = new FileCopy(source);
        int stat = obj.fileCopy(target);
        if (stat == 1)
        {
            System.out.println("SUCCESSFUL");
        } else
        {
            System.out.println("FAIL");
        }
    }
}
