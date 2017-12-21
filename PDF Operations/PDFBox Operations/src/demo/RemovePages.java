package demo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;

public class RemovePages {
	public static void main(String[] args) throws IOException {
		File myFile = new File("G:\\Java Created\\myPdf_1.pdf");
		PDDocument document = PDDocument.load(myFile);
		
		int numberOfPages = document.getNumberOfPages();
		System.out.println("There are "+numberOfPages+" page(s)");
		System.out.println("Enter a page to Delete...");
		Scanner s = new Scanner(System.in);
		int delPage = s.nextInt();
		if(delPage>0&&delPage<numberOfPages) {
			document.removePage(delPage-1); //Pages START FROM 0,1,2.... LIKE ARRAY
			System.out.println("Page Deleted...");
			document.save(myFile);
			document.close();
			System.out.println("Document Saved...");
			System.exit(0);
		}
		System.out.println("Illegal Page Number");
	}
}
