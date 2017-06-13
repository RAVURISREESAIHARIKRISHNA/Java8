package filecopydemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

    FileInputStream fin = null;
    FileOutputStream fout = null;
/*
    fileCopy() Returns 
    
    1 -> Succesfull File Copy
    0 -> UnSuccefull File Copy(Error in any Manner)
    */
    public int fileCopy(String Source, String Destination) {
        int i, status = 0, close_status = 1;
        try {
            /*
            unfortunately NTFS does not treat these File Names as Case Sensitive...
            */
            fin = new FileInputStream(Source);
            fout = new FileOutputStream(Destination);
            close_status = 0;
            while (true) {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                } else {
                    status = 1;
                    break;
                }
            }
        } catch (Exception e) {
            status = 0;
        } finally {
            try {
                fin.close();
                fout.close();
                close_status = 1;
            } catch (Exception e) {
                close_status = 0;
            } finally {
                if (status == 1 && close_status == 1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
