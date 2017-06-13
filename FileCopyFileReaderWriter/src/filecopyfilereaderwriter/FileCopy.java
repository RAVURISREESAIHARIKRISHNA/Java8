package filecopyfilereaderwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy
{

    protected String FileAddress;

    public FileCopy(String FileAddress)
    {
        this.FileAddress = FileAddress;
    }

    public int fileCopy(String Target)
    {
        int er = 0;
        int ch;
        try
        {
            FileReader fr = new FileReader(FileAddress);
            FileWriter fw = new FileWriter(Target);
            while (true)
            {
                ch = fr.read();
                if (ch == -1)
                {
                    break;
                }
                fw.write(ch);
            }
            fr.close();
            fw.close();
        } catch (IOException e)
        {
            er = 1;
        }
        if (er == 0)
        {
            return 1;
        }
        return -1;
    }
}
