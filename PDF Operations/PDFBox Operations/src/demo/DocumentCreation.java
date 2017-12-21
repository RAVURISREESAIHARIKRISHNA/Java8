package demo;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;


public class DocumentCreation {

	public static void main(String[] args) throws IOException{
//		 PDF Document Creation
		PDDocument document = new PDDocument();
		
//		Saving Document
		document.save("G:\\Java Created\\myPdf.pdf");
		
		System.out.println("Document saved");
		
		document.close();

	}

}
