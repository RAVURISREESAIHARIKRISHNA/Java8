package demo;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class LoadingExistingDocument {

	public static void main(String[] args) throws IOException{
		
		File myFile = new File("G:\\Java Created\\myPdf.pdf");
		PDDocument document = PDDocument.load(myFile);
		System.out.println("Document Loaded");
		
//		Processing : Adding a Blank page
		PDPage my_page = new PDPage();
		document.addPage(my_page);
		System.out.println("Blank Page added");
		
		document.save(myFile);
		document.close();
		System.out.println("Document Edited Successfully");

	}

}
