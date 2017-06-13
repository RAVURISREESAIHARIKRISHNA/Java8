package listdirdemo;

import java.io.File;
import java.util.Scanner;

public class ListDirDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Directory");
        String DirName;
        Scanner s = new Scanner(System.in);
        DirName = s.nextLine();
        File f = new File(DirName);
        try
        {
            if(f.isDirectory()){
                String list[] = f.list();
                int count = 0;
                for(String a:list){
                    
                }
                System.out.println(count);
            }
        } catch (java.lang.SecurityException e)
        {System.out.println("SExcep");
        }
    }
    
}
