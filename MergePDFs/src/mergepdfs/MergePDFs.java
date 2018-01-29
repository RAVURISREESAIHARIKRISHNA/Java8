package mergepdfs;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mergepdfs;

import java.io.File;
import java.util.Collections;
import java.util.Date;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

/**
 *
 * @author HARI
 */
public class MergePDFs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

//   
        String dirSrc = "G:\\temp pdfs\\6";
        String dest = "G:\\temp pdfs\\6\\merge.pdf";

        File dir = new File(dirSrc);
        File list[] = dir.listFiles();
        
        for(File file:list)
        {
            System.out.println(file.getName());
        }

        String myFile[] = new String[list.length];
        int j = 0;
        if (list != null) {
            for (File child : list) {
                myFile[j++] = child.getPath();
            }
        }
        for (int i = 0; i <= myFile.length - 1; i++) {
            if (i == 0) {
                String src1 = myFile[0];
                String src2 = myFile[1];

                try {
                    File file1 = new File(src1);
                    PDDocument doc1 = PDDocument.load(file1);
                    File file2 = new File(src2);
                    PDDocument doc2 = PDDocument.load(file2);

                    PDFMergerUtility merge = new PDFMergerUtility();

                    merge.setDestinationFileName(dest);
                    merge.addSource(file1);
                    merge.addSource(file2);
                    merge.mergeDocuments();
                    System.out.println(new Date().toString() + "SUCCESS");;
                    doc1.close();
                    doc2.close();
                } catch (Exception e) {
                    System.out.println(new Date().toString() + "Failure");
                    e.printStackTrace();
                }

                i++;
                continue;
            } else {

                String src2 = myFile[i];
                try {
                    File file1 = new File(dest);
                    PDDocument doc1 = PDDocument.load(file1);
                    File file2 = new File(src2);
                    PDDocument doc2 = PDDocument.load(file2);

                    PDFMergerUtility merge = new PDFMergerUtility();

                    merge.setDestinationFileName(dest);
                    merge.addSource(file1);
                    merge.addSource(file2);
                    merge.mergeDocuments();
                    System.out.println(new Date().toString() + "SUCCESS");;
                    doc1.close();
                    doc2.close();
                } catch (Exception e) {
                    System.out.println(new Date().toString() + "Failure");
                    e.printStackTrace();
                }

            }
        }
    }
}




