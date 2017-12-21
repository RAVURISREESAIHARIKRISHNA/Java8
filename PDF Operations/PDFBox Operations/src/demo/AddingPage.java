package demo;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class AddingPage {

	public static void main(String[] args) throws IOException{
		PDDocument document = new PDDocument();
		
//		Create an empty Page
		PDPage my_page = new PDPage();
		
//		Adding 10 pages
		for(int i=1;i<=10;i++) {
			document.addPage(my_page);
		}
		document.save("G:\\Java Created\\myPdf_1.pdf");
		document.close();
		System.out.println("Successfully Created");

	}

}
