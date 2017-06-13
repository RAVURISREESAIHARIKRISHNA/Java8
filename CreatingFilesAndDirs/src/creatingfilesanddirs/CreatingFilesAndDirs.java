package creatingfilesanddirs;

import java.io.File;
import java.util.Scanner;

public class CreatingFilesAndDirs
{

    public static void main(String[] args)
    {
        System.out.println("Enter a FilenName to create in the CURRENT WORKING DIRECTORY");

        Scanner s = new Scanner(System.in);

        String FileName;
        FileName = s.nextLine();

        File f = new File(FileName);

        try
        {
            System.out.println("Creating " + f.getAbsolutePath());
        } catch (java.lang.SecurityException e)
        {
            System.out.println("Security Exception");
        }

        try
        {
            f.createNewFile();
        } catch (java.io.IOException e)
        {
            System.out.println("IO exception");
        } catch (java.lang.SecurityException e)
        {
            System.out.println("Security Exception");
        }
        System.out.println("File Created Successfully");
        System.out.println("Enter the Parent Directory where a new File is to be created");
        String ParentDir, ChildFile;
        ParentDir = s.nextLine();
        f = new File(ParentDir);
        System.out.println("Creating  Directory...");
        try
        {
            f.mkdir();
        } catch (java.lang.SecurityException e)
        {
            System.out.println("Security Exception");
        }
        System.out.println("Created Successfully...");
        try
        {
            if (f.isDirectory())
            {
                System.out.println("Enter Child FIle");
                ChildFile = s.nextLine();
                f = new File(ParentDir, ChildFile);
                try
                {
                    f.createNewFile();
                } catch (java.lang.SecurityException e)
                {
                    System.out.println("Ssecurity Exception");
                } catch (java.io.IOException e)
                {
                    System.out.println("IO Excep");
                }
                System.out.println(f.getAbsolutePath() + " Created Successfully ");
            }
        } catch (java.lang.SecurityException e)
        {
            System.out.println("Security Exception");
        }
    }
}
